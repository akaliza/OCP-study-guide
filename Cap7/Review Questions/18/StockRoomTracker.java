import java.util.concurrent.*;
import java.util.stream.*;

public class StockRoomTracker {
	
	public static void await(CyclicBarrier cb) { // j1
		try { 
			cb.await();  
		} catch (InterruptedException | BrokenBarrierException e) {
			// Handle exception
		}
	}
	/*
	even if the limit(9) statement was changed to limit(10), the program could still hang, 
	since the JVM might not allocate 10 threads to the parallel stream.
	*/
	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(10,() -> System.out.println("Stock Room Full!")); // j2
		
		IntStream.iterate(1, i -> 1)
			.limit(9)
			.parallel()
			.forEach(i -> await(cb)); // j3
		
		/*		
		ExecutorService service = null;
		service = Executors.newFixedThreadPool(10);
		for(int i=0; i<10; i++)
			service.submit(() -> await(cb));
		*/
			
	}
}