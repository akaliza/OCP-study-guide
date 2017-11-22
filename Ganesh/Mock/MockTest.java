import java.util.stream.*;
import java.util.Comparator; 
import java.util.*;
 
class MockTest {
	public static void main(String []args) {
		  question18(); 
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
	
	

	
	
}