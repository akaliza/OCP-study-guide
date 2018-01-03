import java.util.List;
import java.util.ArrayList; 
import java.util.function.Predicate;

public class Whiz20{
	
	public static void main(String args[]){
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(11);
		numbers.add(13);
		numbers.add(19);
		numbers.add(5);
		
		Predicate<Integer> predit = p -> p > 10; 
		
		numbers.stream().filter(predit) //immutable object 
		
		//numbers.stream().filter(predit).forEach(System.out::print); [11,13,19]
		
		System.out.println(numbers); //[10,11,13,19,5] 
	
	}
}
