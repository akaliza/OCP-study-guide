import java.util.stream.*;
import java.util.*;
import java.util.function.*;

/*
Method 			What Happens for Infinite Streams	 Return Value 	Reduction
allMatch()		Sometimes terminates 				 boolean 		No
/anyMatch()
/noneMatch()

collect() 		Does not terminate 					 Varies 		Yes

count() 		Does not terminate 					 long 			Yes

findAny()		Terminates 						     Optional<T> 	No
/findFirst()											

forEach() 		Does not terminate 					 void 			No

min()/max() 	Does not terminate 					 Optional<T> 	Yes

reduce() 		Does not terminate 					 Varies 		Yes

long count()
Optional<T> min(<? super T> comparator)
Optional<T> max(<? super T> comparator)
Optional<T> findAny()
Optional<T> findFirst()
boolean anyMatch(Predicate <? super T> predicate)
boolean allMatch(Predicate <? super T> predicate)
boolean noneMatch(Predicate <? super T> predicate)
void forEach(Consumer<? super T> action)
-----------------------------------------------------------
T reduce(T identity, BinaryOperator<T> accumulator)
Optional<T> reduce(BinaryOperator<T> accumulator)
<U> U reduce(U identity, BiFunction<U,? super T,U> accumulator,BinaryOperator<U> combiner)
------------------------------------------------------------
<R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator,
BiConsumer<R, R> combiner)
<R,A> R collect(Collector<? super T, A,R> collector)
*/



public class TerminalOp{
	public void count(){
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		System.out.println(s.count()); // 3
		System.out.println();
	}
	public void minMax(){
		Stream<String> s_1 = Stream.of("monkey", "ape", "bonobo");
		Stream<String> s_2 = Stream.of("monkey", "ape", "bonobo","tortoise");
		Optional<String> min = s_1.min((s1, s2) -> s1.length()-s2.length());
		Optional<String> max = s_2.max((s1, s2) -> s1.length()-s2.length());
		min.ifPresent(System.out::println); // ape	
		max.ifPresent(System.out::println); // ape	
		
		Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
		System.out.println(minEmpty.isPresent()); // false
		System.out.println();
	}
	
	public void findAnyAndfindFirst(){
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate(() -> "chimp" + String.valueOf(Math.random()) );
		s.findAny().ifPresent(System.out::println); // monkey
		infinite.findAny().ifPresent(System.out::println); // chimp+MathRandom
		System.out.println();		
	}
	
	public void allMatchAndanyMatchAndnoneMatch(){
		List<String> list = Arrays.asList("monkey", "2", "chimp");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		
		System.out.println(list.stream().anyMatch(x -> Character.isLetter( x.charAt(0) )));  // true
		System.out.println(list.stream().allMatch(x -> Character.isLetter( x.charAt(0) )));  // true
		
		System.out.println(list.stream().anyMatch(pred));  // true
		System.out.println(list.stream().allMatch(pred));  // false
		System.out.println(list.stream().noneMatch(pred)); // false
		System.out.println(infinite.anyMatch(pred)); 	   // true
		System.out.println();	
	}
	
	public void forEach(){
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		s.forEach(System.out::print); // MonkeyGorillaBonobo
		System.out.println();	
		/*
		Stream s = Stream.of(1);
		for (Integer i: s) {} // DOES NOT COMPILE
		*/
		
	}
	
	public void reduce(){
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("", (s, c) -> s + c);
		System.out.println(word); // wolf
		
		/*--method reference-*/
		Stream<String> stream2 = Stream.of("w", "o", "l", "f");
		String word2 = stream2.reduce("PREFIX", String::concat);
		System.out.println(word2); // PREFIXwolf
		
		Stream<Integer> stream3 = Stream.of(3, 5, 6);
		System.out.println(stream3.reduce(2, (a, b) -> a*b));
		
		BinaryOperator<Integer> op = (a, b) -> a * b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(3, 5, 6);
		empty.reduce(op).ifPresent(System.out::println); // no output
		oneElement.reduce(op).ifPresent(System.out::println); // 3
		threeElements.reduce(op).ifPresent(System.out::println); // 90
		
		BinaryOperator<Integer> op2 = (a, b) -> a * b;
		Stream<Integer> stream4 = Stream.of(3, 5, 6);
		System.out.println(stream4.reduce(1, op2, op2)); // 90

		System.out.println();		
		
	}
	
	public void collect(){
		
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add,TreeSet::addAll);
		System.out.println(set); // [f, l, o, w]
		
		/*--make the same---*/
		Stream<String> stream2 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set2 = stream2.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set2); // [f, l, o, w]
		
		/*-Make the same, but not sorted--*/
		Stream<String> stream3 = Stream.of("w", "o", "l", "f");
		Set<String> set3 = stream3.collect(Collectors.toSet());
		System.out.println(set3); // [f, w, l, o]

		
		System.out.println();
	}
	
	public static void main(String...args){
			TerminalOp op = new TerminalOp(); 
			//op.count();
			//op.minMax();
			//op.findAnyAndfindFirst();
			//op.allMatchAndanyMatchAndnoneMatch();
			//op.forEach();
			op.reduce();
			//op.collect();
	}
}