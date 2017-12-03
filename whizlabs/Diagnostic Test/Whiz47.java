import java.util.stream.Stream;
import java.util.OptionalDouble;

public class Whiz47{
	public static void main(String[] args){
		Stream<Integer> stream = Stream.of(1,2,3);
		double avg = stream.skip(2).mapToInt(i -> i.intValue()).average(); //OptionalDouble
		System.out.print(avg);
	}
}