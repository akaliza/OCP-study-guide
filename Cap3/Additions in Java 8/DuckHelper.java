import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class DuckHelper {
	public static int compareByWeight(Duck d1, Duck d2) {
		return d1.getWeight() - d2.getWeight();
	}
	public static int compareByName(Duck d1, Duck d2) {
		return d1.getName().compareTo(d2.getName());
	}
	
	public static void main(String...args){
		Comparator<Duck> byWeight  = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
		Comparator<Duck> byWeight2 = DuckHelper::compareByWeight;
		
		//Takes a single parameter of any type and has a void return type.
		Consumer<List<Integer>> methodRef1 = Collections::sort;
		Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);
		
		//Takes a single parameter of any type and has a boolean return type.
		String str = "abc";
		Predicate<String> methodRef2 = str::startsWith;
		Predicate<String> lambda2 = s -> str.startsWith(s);	
		
		//doesn’t take any parameters and returns any type
		Supplier<ArrayList> methodRef4 = ArrayList::new;
		Supplier<ArrayList> lambda4 = () -> new ArrayList();
		
	}
}