import java.util.stream.Stream;
import java.util.Comparator; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.function.*;

class MockTest {
	public static void main(String []args) {
		  question27(); 
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
	
	public static void question24(){
		DateTimeFormatter fromDateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate firstOct2015 = LocalDate.parse("01/10/2015",fromDateFormat);
		DateTimeFormatter toDateFormat = DateTimeFormatter.ofPattern("dd/MMM/YY");
		System.out.println(firstOct2015.format(toDateFormat));
	}
	
	public static void question26(){
		IntFunction<UnaryOperator<Integer>> func = i -> j -> i * j;
		Integer apply = func.apply(10).apply(20);
		System.out.println(apply);
	}	
	
	public static void question27(){
		List<Map<List<Integer>, List<String>>> list = new ArrayList<>(); // ADD_MAP
		Map<List<Integer>, List<String>> map = new HashMap<>();
		list.add(null); // ADD_NULL
		list.add(map);
		list.add(new HashMap<List<Integer>, List<String>>()); // ADD_HASHMAP
		list.forEach(e -> System.out.print(e + " ")); // ITERATE
		
	}
	
	/*
	e) When run, this program will print the following: null {} {}

	
	*/
}