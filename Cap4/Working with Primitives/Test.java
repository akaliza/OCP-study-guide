import java.util.*;
import java.util.stream.*;

public class Test {
	public static void main(String... args){
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		
		IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::println);

	}
}