import java.nio.file.*;
import java.util.stream.*;

class Whiz46{
	public static void main(String[] args){
		Stream<Double> stream = Stream.of(2.2,2.8,2.5);
		//MapToInt returns a IntStream
		//Stream<Integer> out = stream.mapToInt(Double::intValue);
		IntStream out = stream.mapToInt(Double::intValue);
		System.out.print(out.distinct().count());
	}	

}