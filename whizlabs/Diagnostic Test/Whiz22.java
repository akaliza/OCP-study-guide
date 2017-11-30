import java.util.stream.Stream;
import java.util.stream.IntStream;
public class Whiz22{
	public static void main(String[] args){
		IntStream ds = IntStream.of(1,2,2,4);
		Stream<String> ste = ds.boxed().map(s -> s.toString());  //Integer::toString
		System.out.println(ste.distinct().findFirst());
		
	}


}

/*
reference to toString is ambiguous
both method toString(int) in Integer and method toString() in Integer match)

*/