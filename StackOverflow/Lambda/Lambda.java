import java.util.*;

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
		
	}
	
}