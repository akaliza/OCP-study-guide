import java.util.stream.*;
import java.util.*;

public class Test{
	public static void main(String... args){
		
		Stream<String> empty = Stream.empty(); // count = 0
		Stream<Integer> singleElement = Stream.of(1); // count = 1
		Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 2
		
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
		
		
		List<String> list2 = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list2.stream().filter(n -> n.length() == 4)
			 .sorted()
			 .limit(2)
			 .forEach(System.out::println);
	}
}