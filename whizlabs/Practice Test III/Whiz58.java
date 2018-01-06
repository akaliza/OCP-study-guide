import java.util.Optional;

public class Whiz58{
	public static void main(String[] args){
		Optional<Integer> ops = Optional.of(new Integer(10));
		ops.filter(x -> Integer.compare(12,x) > 0).ifPresent(System.out::print); //10
		System.out.println(ops.get()); //10
		
		/*
		public static int compare(int x,int y)
		                             12, 10        
		if x == y :  0; 
		if x < y  : -1; 
		if x > y  : +1; 
		*/
	}
}	