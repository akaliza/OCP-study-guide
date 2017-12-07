import java.time.LocalDate;

public class Whiz73{
	public static void main(String[] args){
		LocalDate date = LocalDate.of(2015,1,31).plusDay(1); //plusDays()
		System.out.println(date);	
	}
}