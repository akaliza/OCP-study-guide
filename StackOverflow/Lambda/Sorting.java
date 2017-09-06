import java.util.*;
import java.util.Comparator; 
import java.util.stream.*;

class Person{
	private long id;
	private String name;
	
	public Person(long id, String name){
		 this.id = id;
		 this.name = name;
	}	
	
	public long getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name; 
	}
	
	@Override
	public String toString(){
		return ("NAME: " + this.name + " ID: "+ this.id ) ;
	}
	
	
}  

public class Sorting{
	
	public static void main(String...args){
		
		Person p1 = new Person(1,"Arthur");
		Person p2 = new Person(2,"Adrian");
		Person p3 = new Person(3,"Adrian");
		Person p4 = new Person(4,"Michael");
		
		
		List<Person> people = Arrays.asList(p1,p2,p3,p4);

		//1 - Note that Collections.sort(...) only works on collections that are subtypes of List.
		/* old way, before java8 
		Collections.sort(
			people,
			new Comparator<Person>() {
				public int compare(Person p1, Person p2){
					return p1.getName().compareTo(p2.getName());
				}
			});
		*/ 
		
		Collections.sort(
			people, 
			(pe1, pe2) -> pe1.getName().compareTo(pe2.getName())
			);
		
		//method references  
		Collections.sort(
			people,
			Comparator.comparing(Person::getName)
			);
		
		//thenComparing method		
		Collections.sort(
			people, 
			Comparator.comparing(Person::getName).thenComparing(Person::getId));	
		
		
		people.forEach(s -> System.out.println(s.toString()));
		
		
		
		Map<String, Integer> map = new HashMap();  // ... or any other Map class
		map.put("Green",5);
		map.put("yellow",2);
		map.put("red",8);
		
		map = map.entrySet()
			.stream()
			.sorted(Map.Entry.<String, Integer>comparingByValue())
			.collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue(),
									 (k, v) -> k, LinkedHashMap::new));
		System.out.println(map);				  
        
	}
		
}