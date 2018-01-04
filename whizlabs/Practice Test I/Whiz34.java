import java.util.stream.Stream;

public class Whiz34{
	
	public static void main(String[] args){
		Stream<String> sts1 = Stream.of("A","B");
		Stream<String> sts2 = Stream.of("1","2");
		Stream out = Stream.concat(sts1,sts2).parallel().sorted();
		out.forEach(System.out::print);
	}

}