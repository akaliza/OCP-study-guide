public class Whiz5{
	
	static int y = 0; 
	
	public static void main(String[] args){
		abstract class A{
			public abstract int calc(int x);
		}
		
		/*
		adding new method in anonymous class is legal, but it is illegal to call that method
		from outside of anonymous class since the reference type doesn't know such a method exists
		*/
		
		A a = new A(){
			public int calc(int x){return x*y;}
			public void print(int x){System.out.println(calc(x));}
		};

		System.out.println(a.calc(2));	
	}

}