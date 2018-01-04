import java.util.function.Function;

public class Whiz68{
	
	public static void main(String[] args){
		
		Function<Integer,String> fun = s -> s.toString(); //2°
		Function<String,String> fun2 = fun.andThen((String s) -> s + "2")  //3° <String,String>
										  .compose((String s) -> Integer.parseInt(s)); //1° <String,???? >
	}

}