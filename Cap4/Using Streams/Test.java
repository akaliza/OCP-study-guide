import java.util.*;

public class Test{
	public static void main(String... args){
		/*
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
		*/
		
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list.stream().filter(n -> n.length() == 4)
			.sorted()
			.limit(2)
			.forEach(System.out::println);
	}
}