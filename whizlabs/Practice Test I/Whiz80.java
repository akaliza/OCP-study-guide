import java.time.Duration;
import java.time.LocalTime;

public class Whiz80{
	
	public static void main(String[] args){
		
	LocalTime s = LocalTime.of(10,10);	
	LocalTime e = LocalTime.of(20,1);
	long due = Duration.between(s,e).toHours(); //PT9H51M
	System.out.print(due); //9
	
	}

}