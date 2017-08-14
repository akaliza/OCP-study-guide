import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class Pipeline{
	
	/*
	Get the first two names alphabetically that are four characters long in Java 7
	*/
	public static void printnamesOld(){
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		List<String> filtered = new ArrayList<>();
		for (String name: list) {
			if (name.length() == 4) filtered.add(name);
		}
		Collections.sort(filtered);
		Iterator<String> iter = filtered.iterator();
		if (iter.hasNext()) System.out.println(iter.next());
		if (iter.hasNext()) System.out.println(iter.next());
		System.out.println();
	}
	
	/*
	Get the first two names alphabetically that are four characters long in Java 8
	*/
	public static void printnamesNew(){
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list.stream()
			.filter(n -> n.length() == 4)
			.sorted()
			.limit(2)
			.forEach(System.out::println);
		System.out.println();
	}
	
	public static void printnamesNewPeek(){
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list.stream()
			.peek(s -> System.out.println("Before filter: " + s))
			.filter(n -> n.length() == 4)
			.peek(s -> System.out.println("After filter: " + s))
			.sorted()
			.limit(2)
			.forEach(System.out::println);
		System.out.println();
	}
	
	public static void main(String...args){
		printnamesOld();
		printnamesNew();
		printnamesNewPeek();
	}	
}