import java.util.*;
public class CodeRanch{
	
	public static void main(String...args){
		Map<String,String> sb = new TreeMap<>();
		sb.put("koala", "bamboo");
		sb.put("lion", "meat");
		sb.put("giraffe", "leaf");
     
		System.out.println(sb); 
		System.out.println(sb.keySet());   
		System.out.println(sb.values());
	}
	
}