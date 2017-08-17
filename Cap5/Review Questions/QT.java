import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.Temporal;
import java.time.temporal.ChronoUnit;

public class QT{
	
	private static void q6(){
		LocalDate date  = LocalDate.of(2014, 6, 21);
		LocalDate date2 = LocalDate.of(2014, Month.JUNE, 21);
	
	}
	private static void q7(){
		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2);
		//date.plusHours(3); the code does not compile
		System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth()); //2018 APRIL 30
	}
	private static void q8(){
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40); //Exception 
		System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth());
	}
	
	private static void q9(){
		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		date.plusDays(2);
		date.plusYears(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth()); //2018 APRIL 30 
	} 
	
	private static void q10(){
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3); 
		d = d.minus(p); //2015 5 10 -> 2014 MARCH 7T11:22:33 
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f)); //11:22 AM  
	} 
	
	private static void q11(){
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.ofDays(1).ofYears(2);
		d = d.minus(p); //2013 5 10 T 11:22:33 
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d)); //5/10/13 11:22 AM 
	}
	/*
	12
	2016–08–28T05:00 GMT-04:00 9:00 AM    
	2016–08–28T09:00 GMT-06:00 15:00 PM
	*/
	private static void q13(){
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13); 
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);  //2016 MARCH 13  1:30
		ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS); //2016 MARCH 13 3:30 
		long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);   //1?  
		int clock1 = dateTime1.getHour(); //1
		int clock2 = dateTime2.getHour(); //3
		System.out.println(hours + "," + clock1 + "," + clock2); // 2,1,3  
	}
	private static void q14(){
		ZoneId zone = ZoneId.of("US/Eastern");
		LocalDate date =  LocalDate.of(2016, 11, 7);
		/**/
		LocalTime time1 = LocalTime.of(2, 15);
		ZonedDateTime a = ZonedDateTime.of(date, time1, zone);
	}
	
	private static void q15(){
		String m1 = Duration.of(1, ChronoUnit.MINUTES).toString(); 60
		String m2 = Duration.ofMinutes(1).toString(); 60 
		String s = Duration.of(60, ChronoUnit.SECONDS).toString();  1000ms
		String d = Duration.ofDays(1).toString(); 000
		String p = Period.ofDays(1).toString(); //P1D
		System.out.println( );
	}
	
	public static void main(String...args){
		q15();
		
		

	}
}


