import java.util.concurrent.locks.*;
import java.util.concurrent.*;
import java.util.*;

public class Whiz16{
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
		final ExecutorService pool = Executors.newFixedThreadPool(2);
		List<Callable<Integer>> call = new ArrayList<Callable<Integer>>();
		
		call.add(new Task2());
		call.add(new Task1());
		
		System.out.println(pool.invokeAny(call)); //maybe 1 or 2
		
		pool.shutdownNow();
	}
}	