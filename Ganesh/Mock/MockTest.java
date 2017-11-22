import java.util.stream.Stream;
import java.util.Comparator; 
import java.util.ArrayList;
import java.util.Arrays;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


class MockTest {
	public static void main(String []args) {
		  question24(); 
	}
	
	public static void question1(){
		Stream.of("ace ", "jack ", "queen ", "king ", "joker ")
			.mapToInt(card -> card.length()) //3 , 4 , 5 , 4 , 5 
			.filter(len -> len > 3) // 4 , 5 , 4 , 5 
			.peek(System.out::print) // 
			.limit(2); // 4 , 5
	}
	
	public static void question18(){
		Comparator<String> comparer = (country1, country2) -> country2.compareTo(country2); // COMPARE_TO
		String[] brics = {"Brazil", "Russia", "India", "China"};
		Arrays.sort(brics, null);
		Arrays.stream(brics).forEach(country -> System.out.print(country + " ")); // Brazil, China, India, Russia
	}
	//10/Jan/15
	public static void question24(){
		DateTimeFormatter fromDateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate firstOct2015 = LocalDate.parse("01/10/2015",fromDateFormat);
		DateTimeFormatter toDateFormat = DateTimeFormatter.ofPattern("dd/MMM/YY");
		System.out.println(firstOct2015.format(toDateFormat));
	}
	/*
	a) DateTimeFormatter firstOct2015 = DateTimeFormatter.parse("01/10/2015", fromDateFormat);
	b) LocalTime firstOct2015 = LocalTime.parse("01/10/2015",fromDateFormat);
	c) Period firstOct2015 = Period.parse("01/10/2015", fromDateFormat);
	*/

	
}