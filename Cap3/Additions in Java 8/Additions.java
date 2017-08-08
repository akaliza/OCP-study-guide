import java.util.*;
import java.util.function.*;

public class Additions {
	public static void main(String...args){
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		System.out.println(list); // [Magician, Assistant]
		list.removeIf(s -> s.startsWith("A"));
		System.out.println(list); // [Magician]
		
		//Updating All Elements
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		list2.replaceAll(x -> x*2);
		System.out.println(list2); // [2, 4, 6]
		
		//Looping through a Collection
		List<String> cats = Arrays.asList("Annie", "Ripley");
		for(String cat: cats)
			System.out.println(cat);
		cats.forEach(c -> System.out.println(c));
		cats.forEach(System.out::println);
		
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", null);
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}

		
	}
}