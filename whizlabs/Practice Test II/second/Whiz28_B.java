package second;
import first.*; 

public class Whiz28_B extends Whiz28_A{
	public static void main(String[] args){
		Whiz28_A a = new Whiz28_A();
		Whiz28_B b = new Whiz28_B();
		a.change();
		// System.out.print(a.j); doesn't compile
		System.out.print(b.j); //0	
	}
}