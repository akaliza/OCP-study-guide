import java.util.*;
import java.util.function.*; 

@FunctionalInterface
interface FuncInterf {
    void bar();
}

public class Lambda{
	
	public static void main(String...args){
		FuncInterf fi = new FuncInterf() {
		@Override
		public void bar() {
			System.out.println("Hello!");
		}};
		
		fi.bar();
		
		Object funHolder = (FuncInterf) () -> System.out.println("Hello with cast!");
		System.out.println(funHolder instanceof FuncInterf); // returns true
		
		passMeALambda(() -> System.out.println("Lambda called"));
		
	}
	
	//the variables must be treated as final and not modified inside the lambda.
	IntUnaryOperator makeAdder(int amount) {
		return (x) -> (x + amount); // Legal even though amount will go out of scope
									// because amount is not modified
	}
	/*
	IntUnaryOperator makeAccumulator(int value) {
		return (x) -> { value += x; return value; }; // Will not compile
	}
	*/
	
	public static void passMeALambda(FuncInterf f) {
		f.bar();
	}
	

	
}