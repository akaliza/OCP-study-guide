import java.util.*;
import java.util.stream.*;

class Person{
	private String name; 
	private String surname; 
	
	public Person(String n, String s){
		this.name = n;
		this.surname = s;
	}
	
	
	public String getName(){
		return this.name; 
	} 
	
	public String getSurname(){
		return this.surname; 
	}
	
	
}

public class StreamClass{
	
	public static void main(String...args){

		Stream<String> fruitStream = Stream.of("apple", "banana", "pear", "kiwi", "orange");

		fruitStream.filter(s -> s.contains("a"))
           .map(String::toUpperCase)
           .sorted()
           .forEach(System.out::println);

		/*   
		Note that the map() operation will return a stream with a different generic type if the mapping 
		function returns a type different to its input parameter. For example on a Stream<String> calling
		.map(String::isEmpty) returns a Stream<Boolean>
		*/
		Stream<String> fruitStream2 = Stream.of("apple", "banana", "pear", "kiwi", "orange");
		fruitStream2.filter(s -> s.contains("a"))
           .map(String::isEmpty)
           .sorted()
           .forEach(System.out::println); /*Terminal*/ 
		
		Stream<String> fruitStream9 = Stream.of("apple", "banana", "pear", "kiwi", "orange");
		fruitStream9.filter(s -> s.contains("a"))
           .map(s -> s.length())
           .sorted()
           .forEach(System.out::println); /*Terminal*/ 
		
		
		
		/*https://stackoverflow.com/documentation/java/88/streams#t=201709061901349079757*/
		 
		 
		List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 42);  
		// sequential 
		long howManyOddNumbers = integerList.stream()
									.filter(e -> (e % 2) == 1)
                                    .count(); 
		System.out.println(howManyOddNumbers); // Output: 2
		// parallel
		long howManyOddNumbersParallel = integerList.parallelStream()
											.filter(e -> (e % 2) == 1)
                                            .count();
		System.out.println(howManyOddNumbersParallel); // Output: 2
		
		
		List<Person> people = Arrays.asList(
			new Person("Sam", "Rossi"),
			new Person("Sam", "Verdi"),
			new Person("John", "Bianchi"),
			new Person("John", "Rossi"),
			new Person("John", "Verdi"));
		
		Map<String, List<String>> map = people.stream()
        .collect(
                // function mapping input elements to keys
                Collectors.groupingBy(Person::getName, 
                // function mapping input elements to values,
                // how to store values
                Collectors.mapping(Person::getSurname, Collectors.toList()))
        );
		// map = {John=[Bianchi, Rossi, Verdi], Sam=[Rossi, Verdi]}	
		System.out.println(map);

		Stream<String> s2 = Stream.of("TAD","ABC","At");
		Map<Boolean, List<String>> map2 = s2.
		collect(Collectors.partitioningBy( s -> s.startsWith("A")));
		System.out.println(map2);

		
		
		
		
		
	}
}