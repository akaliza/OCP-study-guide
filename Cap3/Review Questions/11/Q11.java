import java.util.*;
import java.util.stream.*;

public class Q11{
	
	public static void main(String...args){
		Map<Integer, Integer> map = new HashMap<>(10);
		for (int i = 1; i <= 10; i++) { // 1-1 2-4 3-9 4-16 5 6 7 8 9 10
			map.put(i, i * i);
		}
		System.out.println(map.get(4)); //16
	}
}