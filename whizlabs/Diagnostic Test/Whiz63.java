import java.util.Map;
import java.util.HashMap;
import java.util.function.ToDoubleBiFunction;

public class Whiz63{
	public static void main(String[] args){
		Map<Integer,Double> map = new HashMap<>();
		map.put(1,1.1);
		map.put(2,2.2);
		map.put(1,3.3); //replace the first value 
		ToDoubleBiFunction<Double,Integer> tdf = (a,b) -> a + b;  
		map.forEach((k,v) -> System.out.print(tdf.applyAsDouble(v,k)));//4.34.2
	}
}