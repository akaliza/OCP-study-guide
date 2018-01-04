import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Whiz82{
	
	public static void main(String[] args){
		
	DateTimeFormatter format = 	DateTimeFormatter.ofPattern("y D");
	LocalDate ld = LocalDate.parse("2015 10",format);
	System.out.print(ld); //2015-01-10
	
	}

}