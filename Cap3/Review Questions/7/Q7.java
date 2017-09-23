import java.util.*;

public class Q7{
	public static void main(String...args){
	
		Set<Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));  //86 - Integer
		numbers.add(75);			   //75_> Integer	
		numbers.add(new Integer(86));  //86 - Integer	
		numbers.add(null);			   //null	
		numbers.add(309L);			   //309_> Long	
		Iterator iter = numbers.iterator();
		while (iter.hasNext())
		System.out.print(iter.next());
	}
}