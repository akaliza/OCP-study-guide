import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class QT{
	
	private static void q1(){
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		System.out.println(stream.limit(2).map(x -> x + "2"));		
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
		//Stream<String> s3 = Stream.generate(() -> "meow");
		//Stream<String> s4 = Stream.generate(() -> "meow");
		Stream<String> s5 = Stream.generate(() -> "meow");
		boolean match1 = s1.allMatch(String::isEmpty);    //false
		boolean match2 = s2.anyMatch(String::isEmpty);  // the code hangs
		//boolean match3 = s3.findAny(String::isEmpty);   // ERRO
		//boolean match4 = s4.findFirst(String::isEmpty); // ERRO
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
	
	public static void main(String...args){
		//q1();
		//Q2(); The code hangs
		//Q3(); Exception
		//Q6();
		//q7();
		q9();
	}
}


