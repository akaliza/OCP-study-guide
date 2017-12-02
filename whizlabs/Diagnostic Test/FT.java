import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class FT{
	public static void main(String[] args){
		int []a = new int[15000];
		for(int x=0; x < 15000;x++){
			a[x] = 1;
		}
		Sum2 s = new Sum2(a,0,a.length);
		System.out.print(Sum2.sumArray(a));			
	}
}


class Sum2 extends RecursiveTask<Long>{ 
	static final int MAX = 5000;
	int low;
	int high;
	int[] array;
	
	Sum2(int[] arr, int lo, int hi){
		array = arr;
		low = lo; 
		high = hi;
	}
	
	public Long compute(){
		if(high - low <= MAX){
			long sum = 0; 
			for(int i=low;i < high; ++i)
				sum += array[i];
			return sum;
		}else{
			int mid = low + (high - low) /2; //7500
			Sum2 left  = new Sum2(array,low,mid);  // [..],0,7500
			Sum2 right = new Sum2(array,mid,high); // [..],7500,15000 
			left.fork();// execute in a separate thread of the ForkJoinPool
			long rightAns = right.compute(); // call until the elements of subarray is less than 5000
			long leftAns = left.join(); // join the outputs of the tasks
			return leftAns + rightAns;	
		}
	}
	
	static long sumArray(int[] array){
		ForkJoinPool fPoll = new ForkJoinPool();
		long sum = fPoll.invoke(new Sum2(array,0,array.length));
		return sum;
	}
}