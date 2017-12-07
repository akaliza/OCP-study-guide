import java.util.*;
import java.util.function.*;

public class Whiz67{
	public static void main(String[] args){
		BiFunction<Double,Double,String> fun = (d,i) -> d + i.toString();
		System.out.println(fun.apply(3.5,2.5));	
	}
}