import java.util.*;
import java.util.concurrent.*;

/*
RecursiveAction is a task that can run in a ForkJoinPool; its compute() method
performs the actual computation steps in the task. It is similar to RecursiveTask, but
does not return a value.
*/


public class WeighAnimalAction extends RecursiveAction {
	private int start;
	private int end;
	private Double[] weights;
	
	public WeighAnimalAction(Double[] weights, int start, int end) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}
	
	@Override 
	protected void compute() {
		if(end-start <= 3) // 1°= 10-0 <=3:ELSE | 2°= 5-0 <= 3:ELSE | 10-5 <=3:ELSE   | 5-2 <=3 IF 
			for(int i=start; i<end; i++) { 
				weights[i] = (double)new Random().nextInt(100);
				System.out.println("Animal Weighed: "+i);
			}
		else {
			int middle = start+((end-start)/2); //1°=5 2°=2 3°=7  
			System.out.println("[start="+start+",middle="+middle+",end="+end+"]"); // 0 5 10 | 0 2 5 | 5 7 10 

			//Executes all the given tasks and returns a list of future objects when all the tasks are completed.			
			invokeAll(new WeighAnimalAction(weights,start,middle), // x,0,5 
					  new WeighAnimalAction(weights,middle,end));  // x,5,10		
		}
	}
	
	public static void main(String[] args) {
		Double[] weights = new Double[10];
		ForkJoinTask<?> task = new WeighAnimalAction(weights,0,weights.length);
		ForkJoinPool pool = new ForkJoinPool(); 
		pool.invoke(task);
		// Print results
		System.out.println();
		System.out.print("Weights: ");
		Arrays.asList(weights).stream().forEach(
		d -> System.out.print(d.intValue()+" "));
	}

}