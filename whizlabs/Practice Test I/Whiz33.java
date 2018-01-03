import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Whiz33{
	
	public static void main(String[] args){
		Stream<String> stream = Stream.of("1","2","3","4").parallel();
		IntStream ins = stream.mapToInt(s -> Integer.parseInt(s));
		//All streams achieved via that stream will be parallel too.
		System.out.println(ins.isParallel());  //true
		
	}

}
