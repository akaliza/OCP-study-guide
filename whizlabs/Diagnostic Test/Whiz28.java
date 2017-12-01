import java.util.HashMap;
import java.util.Map;
public class Whiz28{
	public static void main(String[] args){
		Map<Integer,String> map = new HashMap<>(); 
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		
		map.remove("A");   // try remove elements passed keys, but there is no key A
		map.remove(3,"C"); // remove
		map.remove(4,"B"); // don't find the value B in the key 4 
		
		map.values().forEach(System.out::print); //ABD
	}
}

