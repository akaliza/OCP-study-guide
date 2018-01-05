import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Whiz23{
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//lazy mode
		Stream<Integer> ints = list.stream().map(s -> {System.out.print(s); return Integer.parseInt(s);});	
		System.out.print("Count: ");
		//terminate operation
		System.out.print(ints.count()); //Count: 123455
	}
}