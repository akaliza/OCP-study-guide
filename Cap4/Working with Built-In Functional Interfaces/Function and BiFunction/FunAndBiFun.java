import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.*;

/*
@FunctionalInterface 
public class Function<T, R> {
	R apply(T t);
}
@FunctionalInterface 
public class BiFunction<T, U, R> {
	R apply(T t, U u);
}

Functional Interfaces   # Parameters 	Return Type 	Single Abstract Method
Function<T, R> 			1 				(T) R 			apply
BiFunction<T, U, R> 	2 				(T, U) R 		apply
*/ 

public class FunAndBiFun{
	public static void main(String...args){
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		System.out.println(f1.apply("cluck")); // 5
		System.out.println(f2.apply("cluck")); // 5	
			
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b2.apply("baby ", "chick")); // baby chick
	}
}