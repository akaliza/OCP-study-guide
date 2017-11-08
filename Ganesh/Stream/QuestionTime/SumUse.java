import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SumUse {
	public static void main(String []args) {
		Stream<String> words = Pattern.compile(" ").splitAsStream("a bb ccc");
		System.out.println(words.map(word -> word.length()).sum()); /*can be insert mapToInt*/
	}
}