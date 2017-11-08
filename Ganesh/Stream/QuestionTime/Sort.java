import java.util.*;
class Sort {
	public static void main(String []args) {
		List<String> strings = Arrays.asList("eeny ", "meeny ", "miny ", "mo ");
		Collections.sort(strings, (str1, str2) -> str2.compareTo(str1));
		strings.forEach(string -> System.out.print(string)); //mo miny meeny eeny 
	}
}