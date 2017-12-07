import java.time.LocalDate;
import java.time.Period;


public class Whiz82{
	public static void main(String[] args){
		LocalDate ld = LocalDate.of(2010,1,2); 
		Period due = Period.ofDays(-2).plusMonths(1);
		//2009-12-31 -two days
		//2010-1-31  +one month 
		ld = ld.plus(due);
		System.out.println(ld);	//2010-01-31
	}
}