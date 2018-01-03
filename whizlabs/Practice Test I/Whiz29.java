import java.util.concurrent.atomic.*;

public class Whiz29{
	
	int val = 10; 
	int x; 
		
	Whiz29(int i){
		val = i;
	}
		
	private AtomicInteger value = new AtomicInteger(val); //value is assigned in compile time
	
	public static void main(String[] args){
		Whiz29 at = new Whiz29(5); 
		System.out.println(at.value.decrementAndGet()); //9 
	}

}
