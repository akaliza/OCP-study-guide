import java.util.*;
import java.util.stream.*;

public class Parallel {
	
	public static void main(String[] args) {
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