import java.util.stream.*;
import java.util.*;
import java.util.function.*;
/*
							OptionalDouble 		OptionalInt 	OptionalLong
Getting as a primitive 		getAsDouble() 		getAsInt() 		getAsLong()
orElseGet() param type		DoubleSupplier		IntSupplier		LongSupplier
Return type of max() 		OptionalDouble 		OptionalInt 	OptionalLong
Return type of sum() 		double 				int 			long
Return type of avg() 		OptionalDouble 		OptionalDouble OptionalDouble

*/
public class OptionalP{
		
		public static void main(String...args){
			IntStream stream = IntStream.rangeClosed(1,10);
			OptionalDouble optional = stream.average();
			optional.ifPresent(System.out::println);
			System.out.println(optional.getAsDouble());
			System.out.println(optional.orElseGet(() -> Double.NaN));
			
			LongStream longs = LongStream.of(5, 10);
			long sum = longs.sum();
			System.out.println(sum); // 15
			
			DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
			//OptionalDouble min = doubles.min(); // runs infinitely

		}
}