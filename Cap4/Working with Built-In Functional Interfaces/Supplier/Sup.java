import java.util.function.Supplier;
import java.time.*;
import java.util.*;

/*
@FunctionalInterface 
public class Supplier<T> {
	public T get();
}

Functional Interfaces   # Parameters 	Return Type 	Single Abstract Method
Supplier<T> 			0 			 	T 				get
*/ 

public class Sup{
	public static void main(String...args){
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> {return LocalDate.now();} ;
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1);
		System.out.println(d2);
		
		Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
		ArrayList<String> a1 = s3.get();
		System.out.println(a1);
		
		System.out.println(s3);
		
	}
}