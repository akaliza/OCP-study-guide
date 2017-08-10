import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.*;

/*
@FunctionalInterface 
public class Consumer<T> {
	void accept(T t);
}
@FunctionalInterface 
public class BiConsumer<T, U> {
	void accept(T t, U u);
}

Functional Interfaces   # Parameters 	Return Type 	Single Abstract Method
Consumer<T> 			1 				(T) 			void accept
BiConsumer<T, U> 		2 				(T, U) 			void accept
*/ 

public class ConsAndBiCons{
	public static void main(String...args){
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		c1.accept("Annie");
		c2.accept("Annie");
		
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		System.out.println(map);
	
	}
}