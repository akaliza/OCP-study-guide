import java.util.concurrent.*;
public class Sched1{
	public static void main(String[] args) throws InterruptedException, ExecutionException {
	ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	Runnable task1 = () -> System.out.println("Hello Zoo");
	Callable<String> task2 = () -> "Monkey";
	
	//Future<?> result1 = service.schedule(task1, 3, TimeUnit.SECONDS);
	//Future<?> result2 = service.schedule(task2, 10, TimeUnit.SECONDS);
	service.scheduleAtFixedRate(task1,5,1,TimeUnit.SECONDS);
	
	}
}