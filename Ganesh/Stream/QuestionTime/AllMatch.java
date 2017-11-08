import java.util.stream.Stream;

public class AllMatch {
	public static void main(String []args) {
		boolean result = Stream.of("do", "re", "mi", "fa", "so", "la", "ti")
			.filter(str -> str.length() > 5) // #1
			.peek(System.out::println) // #2
			.allMatch(str -> str.length() > 5); // #3
		System.out.println(result);
	}
}