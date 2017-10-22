	import java.util.*;
import java.util.concurrent.*;

/*
• RecursiveTask<V> is a task that can run in a ForkJoinPool; the compute() method returns a value of type V. 
It inherits from ForkJoinTask.
*/

public class WeighAnimalTask extends RecursiveTask<Double> {
	private int start;
	private int end;
	private Double[] weights;
	
	public WeighAnimalTask(Double[] weights, int start, int end) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}

	protected Double compute() {
		if(end-start <= 3) {
			double sum = 0;
			for(int i=start; i<end; i++) {
				weights[i] = (double)new Random().nextInt(100);
				System.out.println("Animal Weighed: "+i);
				sum += weights[i];
			}
			return sum;
		} else {
			int middle = start+((end-start)/2); //5
			System.out.println("[start="+start+",middle="+middle+",end="+end+"]");
			RecursiveTask<Double> otherTask = new WeighAnimalTask(weights,start,middle);
			otherTask.fork();
			
			//join: Returns the result of the computation when the computation is done
			return new WeighAnimalTask(weights,middle,end).compute() + otherTask.join(); 
		}
	}
	
	public static void main(String[] args) {
		Double[] weights = new Double[10];
		ForkJoinTask<Double> task = new WeighAnimalTask(weights , 0 , weights.length); //Executes the task asynchronously.
		ForkJoinPool  pool = new ForkJoinPool(); //is a thread pool for running fork/join tasks and it executes an instance of ForkJoinTask
		Double sum = pool.invoke(task); //Executes the given task and returns the computed result.
		System.out.println("Sum: "+sum);	
	}
	
}