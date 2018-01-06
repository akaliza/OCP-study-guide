import java.util.stream.Stream;

public class Whiz40{
	public static void main(String[] args){
		Stream<String> strs = Stream.of("2","3","4");
		System.out.println(strs.reduce("1",String::concat,String::concat)); //1234
	}
}	
