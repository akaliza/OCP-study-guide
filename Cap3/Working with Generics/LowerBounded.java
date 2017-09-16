import java.util.*; 
import java.util.stream.*; 

public class LowerBounded{
	
	public static void main(String[] args){
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");
		List<Object> objects = new ArrayList<>(strings);
		addSound(strings);
		addSound(objects);
		strings.forEach(s -> System.out.println(s));
		objects.forEach(s -> System.out.println(s));
	}
	
	public static void addSound(List<? super String>list) {
		list.add("quack");
	}
	
}