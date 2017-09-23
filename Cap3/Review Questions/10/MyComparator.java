import java.util.*;

class MyComparatorNormal implements Comparator<String>{ //REQUEST
	public int compare(String a, String b) {
		return a.toLowerCase().compareTo(b.toLowerCase()); 
	}
} 


public class MyComparator implements Comparator<String> {

	public int compare(String a, String b) {
		return b.toLowerCase().compareTo(a.toLowerCase()); // invertido
	}
	
	public static void main(String[] args) {
		String[] values = { "123", "Abb", "aab" };
		Arrays.sort(values, new MyComparator());
		for (String s: values)
			System.out.println(s + " "); //Abb aab 123 
		
		Arrays.sort(values, new MyComparatorNormal());
		for (String s: values)
			System.out.println(s + " "); //123 aab Abb 
		
		Comparator<String> normalWithLambda = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
		Arrays.sort(values, normalWithLambda);
		for (String s: values)
			System.out.println(s + " "); //123 aab Abb 
	}
}

