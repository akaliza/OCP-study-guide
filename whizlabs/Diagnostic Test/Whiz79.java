import java.time.Period;

public class Whiz79{
	public static void main(String[] args){
		Period p = Period.ofMonths(1);
		p = p.plusYears(2);
		p = p.withYears(1);
		System.out.println(p);// P1Y1M	
	}
}