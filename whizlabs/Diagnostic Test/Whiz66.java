import java.util.function.ToDoubleBiFunction;

public class Whiz66{
	public static void main(String[] args){
		ToDoubleBiFunction<Integer,Integer> ob = (f1,f2) -> f1 + f2; 
		System.out.println(ob.apply(1,2)); //double applyAsDouble(T t, U u)
	}
}