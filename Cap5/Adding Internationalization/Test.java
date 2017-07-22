import java.util.Locale;

public class Test{
	
	public static void main(String...args){
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		System.out.println(Locale.GERMAN); // de
		System.out.println(Locale.GERMANY); // de_DE
		
		
		Locale us = new Locale("en", "US");
		Locale france = new Locale("fr", "FR");
		Locale englishCanada = new Locale("en", "CA");
		Locale frenchCanada = new Locale("fr", "CA");
		
		
		
		
		
	}
	
}