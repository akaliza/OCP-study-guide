interface Function<T>{
	T apply(T t); 
}

public class Whiz5{	
	public static void main(String[] args){
		Function<String> f = String::toUpperCase; 
		System.out.print(f.apply("string"));
	}
	
}