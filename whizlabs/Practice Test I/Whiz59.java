import java.util.Optional;
import java.util.stream.Stream;

public class Whiz59{
	
	public static void main(String[] args){
		Stream<String> streams = Stream.of("one","two","three");
		Optional<String> op = streams.filter(s -> s.length() > 5)
									 .findFirst() //Optional.empty
									 .flatMap(s -> Optional.of("4"));	
		
		System.out.println(op);	//Optional.empty
		
	}

}



/*if a value is presente, apply the provided Optional-bearing mapping
to it, retur that result, and otherwise return an empty Optional*/