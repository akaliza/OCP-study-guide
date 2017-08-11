import java.util.*;
/*
Method		 			  | When Optional Is Empty 		  | When Optional Contains a Value
--------------------------+-------------------------------+--------------------------------
get() 						Throws an exception 			Returns value
ifPresent(Consumer c) 		Does nothing 					Calls Consumer c with value
isPresent() 				Returns false 					Returns true
orElse(T other) 			Returns other parameter 		Returns value
orElseGet(Supplier s) 		Returns result of calling 		Returns value
							Supplier 
orElseThrow(Supplier s) 	Throws exception created 		Returns value
							by calling Supplier

*/



public class Op{
	public static Optional<Double> average(int... scores) {
		if (scores.length == 0) return Optional.empty();
			int sum = 0;
		for (int score: scores) sum += score;
			return Optional.of((double) sum / scores.length);
	}
	
	
	public static void main(String...args){
		System.out.println(average(90, 100)); // Optional[95.0]
		System.out.println(average()); 		// Optional.empty
		
		Optional<Double> opt = average(90, 100);
		if (opt.isPresent())
			System.out.println(opt.get()); // 95.0
		
		Optional<Double> opt2 = average();
		//System.out.println(opt.get()); // bad java.util.NoSuchElementException: No value present
				
	}
}