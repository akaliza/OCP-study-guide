import java.util.stream.*;
import java.util.*;
import java.util.function.*;

/*
Stream<T> filter(Predicate<? super T> predicate)
Stream<T> distinct()
Stream<T> limit(int maxSize)
Stream<T> skip(int n)
<R> Stream<R> map(Function<? super T, ? extends R> mapper)
<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
Stream<T> sorted()
Stream<T> sorted(Comparator<? super T> comparator)
Stream<T> peek(Consumer<? super T> action)
*/


public class IntermediateOp{
	
	public void filter(){
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo","mouse");
		s.filter(x -> x.startsWith("m")).forEach(System.out::print); // monkeymouse
		System.out.println();
	}
	
	public void distinct(){
		Stream<String> s = Stream.of("duck", "duck", "duck", "goose","goose");
		s.distinct().forEach(System.out::print); // duckgoose
		System.out.println();
	}
	
	public void limitAndskip(){
		Stream<Integer> s = Stream.iterate(1, n -> n + 1);
		s.skip(5).limit(3).forEach(System.out::print); // 678
		System.out.println();
	}
	
	public void map(){
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.map(x -> x.length()).forEach(System.out::print); // 676
		System.out.println();
	}
	
	public void flatMap(){
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap(l -> l.stream()).forEach(System.out::print);
		System.out.println();
		
	}
	
	public void sorted(){
		Stream<String> s = Stream.of("brown-", "bear-");
		s.sorted().forEach(System.out::print); // bear-brown
		
		Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
		s2.sorted(Comparator.reverseOrder())
			.forEach(System.out::print); // grizzly-brown bear-
		//s2.sorted(Comparator::reverseOrder); // DOES NOT COMPILE	
			
		System.out.println();
		
	}
	
	public void peek(){
		Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
		long count = stream.filter(s -> s.startsWith("g"))
			.peek(System.out::print).count(); // grizzly
		System.out.println(count); // 1	
	}

	public static void main(String...args){
			IntermediateOp op = new IntermediateOp(); 
			op.filter();
			op.distinct(); 
			op.limitAndskip();
			op.map();
			op.flatMap();
			op.sorted();
			op.peek();
			
	}	
}