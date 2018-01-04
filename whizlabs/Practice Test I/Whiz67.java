import java.util.function.Function;

public class Whiz67{
	
	public static void main(String[] args){
		
		Function<String,Double>	fun = Double::parseDouble;
		Double d = fun.compose((String s) -> s + ".01").andThen(s -> s*2).apply("1"); //2.02
		System.out.print(d);	
	}

}

/*
As you can see, the difference between compose and andThen is the order they execute the functions. 
While the compose function executes the caller last and the parameter first, 
the andThen executes the caller first and the parameter last.

Function<Integer, Integer> times2 = e -> e * 2;
Function<Integer, Integer> squared = e -> e * e;  

times2.compose(squared).apply(4);  
// Returns 32

times2.andThen(squared).apply(4);  
// Returns 64

*/