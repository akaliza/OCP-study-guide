import java.util.Map;
import java.util.TreeMap;

public class Whiz32{
	public static void main(String[] args){
		Map<String,Integer> tmap = new TreeMap<>();
		tmap.put("ab",1);
		tmap.put("abc",2);
		tmap.put("abcd",3);
		tmap.replaceAll((k,v) -> (int)k.charAt(v)); 
		System.out.println(tmap.values()); //98,99,100
		
		}
}	