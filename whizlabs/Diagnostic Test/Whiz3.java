interface I {
	default boolean equals(Object O){ //We can't override Object class methods using default method
		return true;
	}
}

class A implements I{
	public boolean equals(Object O){ 
		return false;
	}	

}
public class Whiz3{	
	public static void main(String[] args){
		A a = new A();
		I ia = new A();
		I i = new I(){};
		System.out.println(a.equals(ia) + " " + i.equals(ia) );
	}
	
}