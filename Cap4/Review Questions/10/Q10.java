import java.util.*;
import java.util.stream.*;

public class Q10{
	
	public static void main(String...args){
			Stream.generate(() -> "1")
				.limit(10)
				.peek(System.out::println)
				.forEach(System.out::println);
	/*
	.filter(x -> x.length() > 1) // never will be higher than 1 if put after the generate; 
	.peek(System.out::println) //Intermediate , can't put in the end.  
	*/
	
	}
}
