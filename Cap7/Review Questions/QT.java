import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class QT{
	
	private static void q3() throws Exception{
		/*
		ExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(() -> { // w1 --does not compile
			System.out.println("Open Zoo");
			return null; // w2
		}, 0, 1, TimeUnit.MINUTES);
		Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
		System.out.println(result.get()); // w4
		*/
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(() -> { // w1 --does not compile because it is assigned to an ExecutorService.
			System.out.println("Open Zoo");
			return; // --does not compile because scheduleWithFixedDelay()supports only Runnable(return void)
		}, 0, 1, TimeUnit.MINUTES);
		Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
		System.out.println(result.get()); // w4
	}			
			
	private static void q4(){
		AtomicLong value1 = new AtomicLong(0);
		final long[] value2 = {0};
		IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> value1.incrementAndGet()); //100
		IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> ++value2[0]); //undefined
		System.out.println(value1+" "+value2[0]);
	}
	
	/*
	private static void q7(){
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = new CopyOnWriteArrayList<>(l1);
		Set<Integer>  s3 = new ConcurrentSkipListSet<>();
		s3.addAll(l1);
		for(Integer item: l2) l2.add(4); // x1
		for(Integer item: s3) s3.add(5); // x2
		System.out.println(l1.size()+" "+l2.size()+" "+s3.size());
	}
	
	private static void q8(){
		Integer i1 = Arrays.asList(1,2,3,4,5).stream().findAny().get(); //1  
		synchronized(i1) { // y1
			Integer i2 = Arrays.asList(6,7,8,9,10)
				.parallelStream()
				.sorted() // y2
				.findAny().get(); // y3
			System.out.println(i1+" "+i2);
		}
	}

	private static void q10(){
		System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
			.parallelStream().parallel() // q1
			.reduce(0,
				    (c1, c2) -> c1.length() + c2.length(), // q2
					(s1, s2) -> s1 + s2)); // q3
	}
	*/
	public static void main(String...args) throws Exception{
		q4();
	}
}


