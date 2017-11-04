import java.util.Arrays;
import java.util.List;

class MethodReference {
	public static void printUpperCaseString(String string) {
		System.out.println(string.toUpperCase());
	}
	
	public static void main(String []args) {
		List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
		strings.forEach(MethodReference::printUpperCaseString);
	}
}