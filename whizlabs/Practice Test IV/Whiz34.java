import java.util.*;
import java.util.concurrent.*;

public class Whiz34{
	public static void main(String[] args){
		String[]s = new String[2];
		s[1] = "B";	
		ConcurrentHashMap<String,Integer> cmap = new ConcurrentHashMap<>();
		cmap.put("A",new Integer(1));
		cmap.put(s[0],new Integer(2)); //NUllPointerException
		cmap.put("C",3);
		cmap.putIfAbsent("D",new Integer(4)); 
		System.out.println(cmap); 
		
		}
}	