import java.util.*;
import java.util.stream.*;

public class StreamClass{
	
	public static void main(String...args){

		Stream<String> fruitStream = Stream.of("apple", "banana", "pear", "kiwi", "orange");

		fruitStream.filter(s -> s.contains("a"))
           .map(String::toUpperCase)
           .sorted()
           .forEach(System.out::println);

		/*   
		Note that the map() operation will return a stream with a different generic type if the mapping 
		function returns a type different to its input parameter. For example on a Stream<String> calling
		.map(String::isEmpty) returns a Stream<Boolean>
		*/
		Stream<String> fruitStream2 = Stream.of("apple", "banana", "pear", "kiwi", "orange");
		fruitStream2.filter(s -> s.contains("a"))
           .map(String::isEmpty)
           .sorted()
           .forEach(System.out::println); /*Terminal*/ 
		
		/*https://stackoverflow.com/documentation/java/88/streams#t=201709061901349079757*/
		 
	}
}