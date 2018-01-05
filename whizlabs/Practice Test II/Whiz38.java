import java.util.concurrent.locks.*;
import java.util.concurrent.*;
import java.util.*;

public class Whiz38{

	static class Task1 implements Callable<Integer>{
		public Integer call(){
			return 1;
		}
	}
	
	static class Task2 implements Callable<Integer>{
		public Integer call(){
			return 2;
		}
	}
	
	static class Task3 implements Callable<Double>{
		public Double call(){
			return 3.0;
		}
	}
	

	public static void main(String[] args) throws Exception{
		final ExecutorService pool = Executors.newFixedThreadPool(5);
		List<Callable<Integer>> call = new ArrayList<>();
		
		call.add(new Task2());
		call.add(new Task1());
		
		List<Future<Integer>> futures = pool.invokeAll(call);
		for(Future<Integer> future : futures){
			System.out.println("Task " + future.get()); //Task 2 Task 1
		}
		pool.shutdownNow();
	}
}