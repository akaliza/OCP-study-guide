import java.util.List; 
import java.util.ArrayList; 

public class Whiz18{	
	public static void main(String[] args){
		List<String> lst = new ArrayList<>(); 
		lst.add("a");
		lst.add("ab");
		lst.stream().forEach(s -> System.out.print(s.length()));
		//.forEach(System.out::print); //doesn't compile
		lst.forEach(System.out::print); //compile
	}
	
}