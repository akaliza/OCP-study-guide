import java.util.*; 
import java.time.*;

public class NewLocale{
	public static void main(String...args){
		System.out.println(Locale.getDefault()); // en_US
		Locale locale = new Locale("fr");
		Locale.setDefault(locale); // change the default
		System.out.println(Locale.getDefault()); // fr
		
		LocalDate d = LocalDate.of(2017,Month.AUGUST,40);
		
	}
}