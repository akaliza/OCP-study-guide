import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Whiz61{
	public static void main(String[] args){
		Stream<Double> stream = Stream.of(12.1,12.5,12.9);
		Stream<Integer> list = stream.flatMap(d -> Stream.of(d.intValue()));
		System.out.println(list.collect(Collectors.toSet())); //12
		
	}
}