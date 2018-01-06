import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Whiz28{
	public static void main(String[] args){
		Map<String,String> map = new HashMap<>();
		map.put("1","A");
		map.put("2","B");
		map.put("3","C");
		map.put("4","D");
		map.forEach((k,v) -> map.replace(k,"D","A")); //[4,A]
		map.values().stream().collect(Collectors.toSet()).forEach(System.out::print); //ABC
	}
}	
