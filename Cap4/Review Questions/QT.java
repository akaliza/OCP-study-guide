import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class QT{
	
	private static void q1(){
		Stream<String> stream = Stream.iterate("", (s) -> s + "1"); //The first element (position 0) in the Stream will be the provided seed 
		System.out.println(stream.limit(2).map(x -> x + "2")); //reference
		//stream.limit(2).map(x -> x + "2").forEach(System.out::print);	//1=> "" -> "" + "2" = "2"; 2=> "1" -> "1" + "2" = "12" 
		System.out.println();
	}
	
	private static void q2(){
		Predicate<? super String> predicate = s -> s.startsWith("g");
		Stream<String> stream1 = Stream.generate(() -> "growl! ");
		Stream<String> stream2 = Stream.generate(() -> "growl! ");
		boolean b1 = stream1.anyMatch(predicate); //true
		boolean b2 = stream2.allMatch(predicate); //The code hangs
		System.out.println(b1 + " " + b2);
	}
	
	private static void q3(){
		Predicate<? super String> predicate = s -> s.length() > 3;
		Stream<String> stream = Stream.iterate("-", (s) -> s + s); 
 		boolean b1 = stream.noneMatch(predicate); //false 
		boolean b2 = stream.anyMatch(predicate);  //(true)-> stream has already been operated upon or closed
		System.out.println(b1 +  " " + b2);
	}
	
	private static  void q6(){
		Stream<String> s1 = Stream.generate(() -> "meow");
		Stream<String> s2 = Stream.generate(() -> "meow");
		Stream<String> s3 = Stream.generate(() -> "meow");
		Stream<String> s4 = Stream.generate(() -> "meow");
		Stream<String> s5 = Stream.generate(() -> "meow");
		boolean match1 = s1.allMatch(String::isEmpty);    //false
		boolean match2 = s2.anyMatch(String::isEmpty);  // the code hangs
		//boolean match3 = s3.findAny(String::isEmpty);   // ERROR Not take a predicate param and return boolean 
		//boolean match4 = s4.findFirst(String::isEmpty); // ERROR Not take a predicate param and return boolean
		boolean match5 = s5.noneMatch(String::isEmpty); // the code hangs 
		System.out.println(match1);
		System.out.println(match2);
		//System.out.println(match3);
		//System.out.println(match4);
		System.out.println(match5);		  
	} 
	
	private static List<String> sort(List<String> list) {
		
		List<String> copy = new ArrayList<>(list);
		Collections.sort(copy, (a, b) -> b.compareTo(a));
		return copy;
		/*
		*/
	}
	
	private static void q7(){
		List<String> names = Arrays.asList("Ryan", "Julie", "Zo");
		List<String> sortedNames = q7Call(names);
		System.out.println(names);
		System.out.println(sortedNames);

	}
	
	private static List<String> q7Call(List<String> list) {
		/**ERRO 
		return list.stream()
			.compare((a, b) -> b.compareTo(a))
			.collect(Collectors.toList());  
		return list.stream()
			.compare((a, b) -> b.compareTo(a))
			.sort(); 
		return list.stream()
			.compareTo((a, b) -> b.compareTo(a))
			.collect(Collectors.toList());	
		return list.stream()
			.compareTo((a, b) -> b.compareTo(a))
			.sort();
		
		return list.stream()
			.sorted((a, b) -> b.compareTo(a))
			.collect();*/
		return list.stream()
			.sorted((a, b) -> b.compareTo(a))
			.collect(Collectors.toList());
			
	}
	
	private static void q9(){
		LongStream ls = LongStream.of(1, 2, 3);
		OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
		if (opt.isPresent()) System.out.println(opt.getAsLong());
	}
	
	private static void q10(){
		System.out.print(
			Stream.iterate(1, x -> ++x)
				.limit(5)
				.map(x -> "" + x)
				.collect(Collectors.joining())
			);
	}
	
	private static void q13(){
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5, 6);
		List<Integer> l3 = Arrays.asList();
		Stream.of(l1, l2, l3)
		//	.map(x -> x + 1)
		//	.flatMap(x -> x.stream())
			.forEach(System.out::print);
	}
		
	private static void q14(){
		Stream<Integer> s = Stream.of(1);
		IntStream is = s.mapToInt(x -> x);
		//DoubleStream ds = s.mapToDouble(x -> x);
		//Stream<Integer> s2 = ds.mapToInt(x -> x);
		//s2.forEach(System.out::print);
	}
	
	private static void q16(){
		Stream<String> s = Stream.empty();
		Stream<String> s2 = Stream.empty();
		Map<Boolean, List<String>> p = s.collect(
		Collectors.partitioningBy(b -> b.startsWith("c")));
		Map<Boolean, List<String>> g = s2.collect(
		Collectors.groupingBy(b -> b.startsWith("c")));
		System.out.println(p + " " + g);
	}
		
	private static void q18(){	
		DoubleStream s = DoubleStream.of(1.2, 2.4);
		s.peek(System.out::println).filter(x -> x > 2).count();
		//1.2,2.4
	}
	
	public static void main(String...args){
		q1();
	}
}


