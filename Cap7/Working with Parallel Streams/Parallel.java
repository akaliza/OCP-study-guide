import java.util.*;
import java.util.stream.*;

public class Parallel {
	
	public static void main(String[] args) {
											  
			System.out.println(Arrays.asList(1,2,3,4,5,6)
									.stream()
									.reduce(0,(a,b) -> (a-b))); //1-2=-1;-1-3=-4;-4-4=-8;-8-5=-13;-13-6=-21
			System.out.println();
			
			Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
			Stream<Integer> parallelStream = stream.parallel();
			Stream<Integer> parallelStream2 = Arrays.asList(1,2,3,4,5,6).parallelStream();
			
			Arrays.asList(1,2,3,4,5,6)
				.stream()
				.forEach(s -> System.out.print(s+" "));
			System.out.println();
			
			Arrays.asList(1,2,3,4,5,6)
				.parallelStream()
				.forEach(s -> System.out.print(s+" "));
			System.out.println();
			
			Arrays.asList("jackal","kangaroo","lemur")
				.parallelStream()
				.map(s -> s.toUpperCase())
				.forEach(System.out::println);
			System.out.println();

			Arrays.asList("jackal","kangaroo","lemur")
				.parallelStream()
				.map(s -> {System.out.println(s); return s.toUpperCase();})
				.forEach(System.out::println);

					
	}
}