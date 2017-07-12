import java.util.*;

public class Test{
	public static void main(String... args){
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
	}
}