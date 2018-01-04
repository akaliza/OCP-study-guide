import java.util.stream.IntStream;

public class Whiz55{
	
	public static void main(String[] args){
		IntStream ints = IntStream.of(3,2,1,5,3);
		ints.peek(System.out::print).allMatch(i -> i > 1); //321
		
	}

}