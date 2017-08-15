import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class AdvancedStream{
		
		private static void lazilyStream() {
			List<String> cats = new ArrayList<>();
			cats.add("Annie");
			cats.add("Ripley");
			Stream<String> stream = cats.stream();
			cats.add("KC");
			System.out.println(stream.count());
		}
		
		private static void threeDigit(Optional<Integer> optional) {
			if (optional.isPresent()) { // outer if
				Integer num = optional.get();
				String string = "" + num;
				if (string.length() == 3) // inner if
					System.out.println(string);
			} 
		}
		
		private static void threeDigitChaining(Optional<Integer> optional) {
			optional.map(n -> "" + n) // part 1
				.filter(s -> s.length() == 3) // part 2
				.ifPresent(System.out::println); // part 3
		}
		


		public static void main(String...args){
			lazilyStream();
			//threeDigitChaining();
			
		}
}