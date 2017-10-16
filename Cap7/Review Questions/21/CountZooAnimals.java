import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class CountZooAnimals {

	public static Integer performCount(int exhibitNumber) {
		// IMPLEMENTATION OMITTED
		return 1; //or null or exception or deadlock
	}
	
	public static void printResults(Future<?> f) {
		try {
			System.out.println(f.get()); // o1
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}
	
	public static void main(String[] args) throws InterruptedException,ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		final List<Future<?>> results = new ArrayList<>();
		IntStream.range(0, 10)
			.forEach(i -> results.add(service.submit(() -> performCount(i)))); // o2
		results.stream().forEach(f -> printResults(f));
		service.shutdown();
	}
}


