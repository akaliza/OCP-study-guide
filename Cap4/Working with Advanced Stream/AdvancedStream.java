import java.util.stream.*;
import java.util.*;
import java.util.function.*;




public class AdvancedStream{
		
		private static void lazilyStream() {
			List<String> cats = new ArrayList<>();
			cats.add("Annie");
			cats.add("Ripley");
			Stream<String> stream = cats.stream();
			cats.add("KC");
			System.out.println(stream.count());
			System.out.println();
		}
		
		private static void threeDigit(Optional<Integer> optional) {
			if (optional.isPresent()) { // outer if
				Integer num = optional.get();
				String string = "" + num;
				if (string.length() == 3) // inner if
					System.out.println(string);
			} 
		}
		
		private static void threeDigitChaining(Optional<Integer> optional) {
			optional.map(n -> "" + n) // part 1
				.filter(s -> s.length() == 3) // part 2
				.ifPresent(System.out::println); // part 3
		}
		
		private static void collecting(){
			Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
			String result = ohMy.collect(Collectors.joining(", "));
			System.out.println(result); // lions, tigers, bears
			
			Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
			Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
			System.out.println(result2); // 5.333333333333333
			
			/*
			Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
			TreeSet<String> result3 = ohMy3.filter(s -> s.startsWith("t").collect(Collectors.toCollection(TreeSet::new)));
			System.out.println(result3); // [tigers]
			*/
			System.out.println();
		}
		
		private static void collectingIntoMaps(){
			Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
			Map<String, Integer> map = ohMy.collect(
				Collectors.toMap(s -> s, String::length));
			System.out.println(map); // {lions=5, bears=5, tigers=6}
			
			Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
			Map<Integer, String> map2 = ohMy2.collect(Collectors.toMap(
			String::length, k -> k, (s1, s2) -> s1 + "," + s2));
			System.out.println(map2); // {5=lions,bears, 6=tigers}
			System.out.println(map2.getClass()); // class. java.util.HashMap

			System.out.println();
		}

		
		private static void collectingUsingGPM(){
			Stream<String> ohMy = Stream.of("lions", "tigers", "bears", "bee");
			Map<Integer, List<String>> map = ohMy.collect(
			Collectors.groupingBy(String::length));
			System.out.println(map); // {3=[bee],5=[lions, bears], 6=[tigers]}

			Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
			Map<Integer, Set<String>> map2 = ohMy2.collect(
			Collectors.groupingBy(String::length, Collectors.toSet()));
			System.out.println(map2); // {5=[lions, bears], 6=[tigers]}
			
			Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
			TreeMap<Integer, Set<String>> map3 = ohMy3.collect(
			Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
			System.out.println(map3); // {5=[lions, bears], 6=[tigers]}
			
			Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
			Map<Boolean, List<String>> map4 = ohMy4.collect(
			Collectors.partitioningBy(s -> s.length() <= 5));
			System.out.println(map4); // {false=[tigers], true=[lions, bears]}

			Stream<String> ohMy5 = Stream.of("lions", "tigers", "bears");
			Map<Integer, Long> map5 = ohMy5.collect(Collectors.groupingBy(
			String::length, Collectors.counting()));
			System.out.println(map5); // {5=2, 6=1}
			
			/*
			Stream<String> ohMy6 = Stream.of("lions", "tigers", "bears");
			Map<Integer, Optional<Character>> map6 = ohMy6.collect(
				Collectors.groupingBy(
					String::length,
					Collectors.mapping(s -> s.charAt(0),
					Collectors.minBy(Comparator.naturalOrder()))));
			System.out.println(map6); // {5=Optional[b], 6=Optional[t]}
			
			
			Stream<String> ohMy7 = Stream.of("lions", "tigers", "bears");
			Map<Integer, Optional<Character>> map7 = ohMy7.collect(
				groupingBy(
				String::length,
				mapping(s -> s.charAt(0),
				minBy(Comparator.naturalOrder()))));
			System.out.println(map); // {5=Optional[b], 6=Optional[t]}
			*/
			
			System.out.println();
		}

		public static void main(String...args){
			lazilyStream();
			collecting();
			//threeDigitChaining();
			collecting();
			collectingIntoMaps();
			collectingUsingGPM();
			
		}
}