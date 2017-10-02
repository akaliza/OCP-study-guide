import java.util.concurrent.*;

public class FutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> future = service.submit(() -> System.out.println("Hello Zoo"));
			future.get(10, TimeUnit.SECONDS);
		} catch (TimeoutException e) {
			System.out.println("Not reached in time");
		} finally {
			if(service != null) service.shutdown();
		}
	}
}