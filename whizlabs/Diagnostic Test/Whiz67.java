import java.util.*;
import java.util.function.*;

public class Whiz67{
	public static void main(String[] args){
		BiFunction<Double,Double,String> fun = (d1,d2) -> d1 + d2.toString();
		System.out.println(fun.apply(3.5,2.5));	
		
	}
}