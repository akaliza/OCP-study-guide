import java.util.*;
import java.util.function.*;

public class Q4 {
	public static void main(String...args){
		ArrayDeque<String> greetings = new ArrayDeque<String>(); 
		greetings.push("hello"); //[hello]   push -> LIFO(last-in, first-out)
		greetings.push("hi");	 //[hi,hello]
		greetings.push("ola");	 //[ola,hi,hello]
		greetings.pop();		 //[hi,hello]	
		greetings.peek();		 //[hi,hello]
		while (greetings.peek() != null)
			System.out.print(greetings.pop()); //hihello
	}
}