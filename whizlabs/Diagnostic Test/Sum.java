import java.util.concurrent.*;

class Sum extends RecursiveAction<Long>{ //RecursiveTask<Long>
	static final int MAX = 50000;
	int low;
	int high;
	int[] array;
	
	Sum(int[] arr, int lo, int hi){
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
			int mid = low + (high - low) /2;
			Sum left = new Sum(array,low,mid);
			Sum right = new Sum(array,mid,high);
			long rightAns = right.compute();
			left.fork();
			long leftAns = left.join();
			return leftAns + rightAns;	
		}
	}
}