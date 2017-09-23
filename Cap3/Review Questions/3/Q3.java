import java.util.*;
import java.util.function.*;

public class Q3 {
	public static void main(String...args){
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add(7);
		for (String s: list) //error - can be Object [s: list]
			System.out.print(s);
	
	}
}