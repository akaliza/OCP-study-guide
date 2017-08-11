import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.*;

/*
@FunctionalInterface 
public class UnaryOperator<T> extends Function<T, T> { }
@FunctionalInterface 
public class BinaryOperator<T> extends BiFunction<T, T, T> { }

T apply(T t);
T apply(T t1, T t2);

Functional Interfaces   # Parameters 	Return Type 	Single Abstract Method
UnaryOperator<T> 		1 				(T) T 			apply
BinaryOperator<T> 		2 				(T, T) T 		apply

*/ 

public class UnOperAndBiOper{
	public static void main(String...args){
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();
		System.out.println(u1.apply("chirp"));
		System.out.println(u2.apply("chirp"));
		
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b2.apply("baby ", "chick")); // baby chick
		
	}
}