import java.util.*;

public class A  // outer class
{
   static public class B //Static Nested class . It can be used in other places: A.B b = new A.B(); There is no outer instance.
   {
   }
   
   class C //Inner class. It can only be used like this: A.C c = new A().new C(); Outer instance is needed.
   {
	   private final static int x = 10;
	   public void showX(){
		   System.out.println(x);
	   }
   }
   
   public static void main(String...args){
		A.B b = new A.B();
		A.C c = new A().new C();
		c.showX();
   }
   
}
