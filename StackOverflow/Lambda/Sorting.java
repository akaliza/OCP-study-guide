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
		return this.name;
	}
	
	
}  

public class Sorting{
	
	public static void main(String...args){
		
		Person p1 = new Person(1,"Arthur");
		Person p2 = new Person(2,"Adrian");
		
		List<Person> people = Arrays.asList(p1,p2);
		
		Collections.sort(
			people,
			new Comparator<Person>() {
				public int compare(Person p1, Person p2){
					return p1.getName().compareTo(p2.getName());
				}
			});
		
		people.forEach(s -> System.out.println(s.toString()));
        /*https://stackoverflow.com/documentation/java/91/lambda-expressions#t=201708241216302789188*/
	}
		
}