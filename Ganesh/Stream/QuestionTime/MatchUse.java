import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class MatchUse {
	public static void main(String []args) {
		IntStream temperatures = IntStream.of(-5, -6, -7, -5, 2, -8, -9);
		IntPredicate positiveTemperature = temp -> temp > 0; // #1
		if(temperatures.anyMatch(positiveTemperature)) { // #2
			int temp = temperatures
				.filter(positiveTemperature)
				.findAny()
				.getAsInt(); // #3
			System.out.println(temp);
		}
	}
}