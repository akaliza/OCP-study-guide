import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class Summ{
		private static int max(IntStream ints) {
			OptionalInt optional = ints.max();
			return optional.orElseThrow(RuntimeException::new);
		}
		
		private static int range(IntStream ints) {
			IntSummaryStatistics stats = ints.summaryStatistics();
			if (stats.getCount() == 0) throw new RuntimeException();
			return stats.getMax()-stats.getMin();
		}

		public static void main(String...args){
			IntStream ints  = IntStream.of();
			IntStream ints2 = IntStream.of(10,20,30,40);
			//max(ints);
			System.out.println(range(ints2));
		}
}