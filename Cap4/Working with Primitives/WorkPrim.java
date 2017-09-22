import java.util.stream.*;
import java.util.*;
import java.util.function.*;
/*

Source Stream	 To Create	To Create	   To Create	To Create 
Class			 Stream		DoubleStream   IntStream	LongStream
--------------------------+--------------+----------+-------------
Stream 			| map 		mapToDouble    mapToInt 	mapToLong
DoubleStream 	| mapToObj 	map 	   	   mapToInt 	mapToLong
IntStream 		| mapToObj 	mapToDouble    map 			mapToLong
LongStream 		| mapToObj 	mapToDouble    mapToInt 	map


Source Stream	 To Create		To Create	      To Create			To Create 
Class			 Stream			DoubleStream      IntStream			LongStream
-----------------------------+------------------+---------------+-------------
Stream 		     Function 	   ToDoubleFunction    ToIntFunction   ToLongFunction

DoubleStream 	 Double		   DoubleUnary		   DoubleToInt	   DoubleToLong	
				 Function      Operator 		   Function		   Function		
			
IntStream		 IntFunction   IntToDouble		   IntUnary		   intToLong		 	
							   Function			   Operator		   Function
	
LongStream		 LongFunction  LongToDouble		   LongToInt	   LongUnary
							   Function			   Function		   Operator			


*/
public class WorkPrim{
	
		public static void doubleStream(){
			
			double d1 = 1.0;
			DoubleToIntFunction f1 = x -> 1;
			int a = f1.applyAsInt(d1);
			
			
			DoubleStream oneValue = DoubleStream. of (3.14);
			DoubleStream varargs = DoubleStream. of (1.0, 1.1, 1.2);
			oneValue.forEach(System.out::println);
			System.out.println();
			varargs.forEach(System.out::println);
			System.out.println();
			
			DoubleStream random = DoubleStream. generate (Math::random);
			DoubleStream fractions = DoubleStream. iterate (.5, d -> d / 2);
			random.limit(3).forEach(System.out::println);
			System.out.println();
			fractions.limit(3).forEach(System.out::println);
			System.out.println();
			
		}
		
		public static void intStream(){
			IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
			count.forEach(System.out::println);
			
			IntStream range = IntStream.range(1, 6);
			range.forEach(System.out::println);
			
			IntStream rangeClosed = IntStream.rangeClosed(1, 5);
			rangeClosed.forEach(System.out::println);
			
			Stream<String> objStream = Stream.of("penguin", "fish");
			IntStream intStream = objStream.mapToInt(s -> s.length());
			
			
			
			System.out.println();
			
			
		}
		public static void main(String...args){
			doubleStream();
			intStream();
		}
}