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
		
		//putIfAbsent
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", null);
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}

		//Merge
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1: v2;
		Map<String, String> favorites2 = new HashMap<>();
		favorites2.put("Jenny", "Bus Tour");
		favorites2.put("Tom", "Tram");
		String jenny = favorites2.merge("Jenny", "Skyride", mapper);
		String tom = favorites2.merge("Tom", "Skyride", mapper);
		System.out.println(favorites2); // {Tom=Skyride, Jenny=Bus Tour}
		System.out.println(jenny); // Bus Tour
		System.out.println(tom); // Skyride
		System.out.println();
		
		//computeIfPresent 
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		BiFunction<String, Integer, Integer> mapper2 = (k, v) -> v + 1;
		Integer jenny2 = counts.computeIfPresent("Jenny", mapper2);
		Integer sam2 = counts.computeIfPresent("Sam", mapper2);
		System.out.println(counts); // {Jenny=2}
		System.out.println(jenny2); // 2
		System.out.println(sam2); // null
		
		//computeIfAbsent
		Map<String, Integer> counts2 = new HashMap<>();
		counts2.put("Jenny", 15);
		counts2.put("Tom", null);
		Function<String, Integer> mapper3 = (k) -> 1;
		Integer jenny3 = counts.computeIfAbsent("Jenny", mapper3); // 15
		Integer sam3 = counts.computeIfAbsent("Sam", mapper3); // 1
		Integer tom3 = counts.computeIfAbsent("Tom", mapper3); // 1
		System.out.println(counts2); // {Tom=1, Jenny=15, Sam=1}
		
	}
}