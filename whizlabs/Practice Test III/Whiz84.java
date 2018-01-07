import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Whiz84{
	public static void main(String[] args){
		String date = "1994-2-28 11:22"; 
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-M-dd H:m"); 
		LocalDateTime ldt = LocalDateTime.parse(date,format); 
		System.out.println(ldt); //1992-02-28T11:22 -->MONTHS format
	}
}	