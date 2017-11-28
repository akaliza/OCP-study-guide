import java.util.*;

public class A  // outer class
{
   static public class B //Static Nested class . It can be used in other places: A.B b = new A.B(); There is no outer instance.
	{
		public class D{
			
		} 
   
   }
   
   class C //Inner class. It can only be used like this: A.C c = new A().new C(); Outer instance is needed.
   {
	   private final static int x = 10;
	   public void showX(){
		   
		   class localClass{
			   public static final int a = 50;
		   }
		   
		   System.out.println(x);
	   }
   }
   
   public static void main(String...args){
		A.B b = new A.B();
		A.B.D d = new A.B().new D();
		A.C c = new A().new C();
		c.showX();
   }
   
}
