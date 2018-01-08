import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Whiz28{
	public static void main(String[] args){
		IntStream ints = IntStream.of(5,10,15);
		
		//Ambigous method reference: both toString() and toString(1) from the type Integer are elegible
		//Stream<String> stngs = ints.boxed().map(Integer::toString);
		
		Stream<String> stngs = ints.boxed().map(s -> s.toString()); //Optional[5]
		System.out.println(stngs.findAny()); 	
		}
}	