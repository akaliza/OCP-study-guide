import java.util.*;
import java.util.stream.*;

public class Q15{
	
	public static void main(String...args){
		Comparator<Integer> c = (o1, o2) -> o2-o1;
		List<Integer> list = Arrays.asList(5, 4, 7, 1);
		Collections.sort(list, c); //7,5,4,1
		System.out.println(Collections.binarySearch(list, 1)); // D. The result is undefined.
	}
}