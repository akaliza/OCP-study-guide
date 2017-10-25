import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.EOFException; 

class A{}
class B extends A{}
class C extends B{}
class D extends C{}


public class Excep {

	public static void main(String[] args) throws IOException {
		List<? super B> exceptions = new ArrayList<>();
		exceptions.add(new C());
		exceptions.add(new B()); 	
		//exceptions.add(new A());	erro 

		/**(upperbounded and unbounded generics are immutable)**/
		//passUpperBounded(new ArrayList<A>());
		passUpperBounded(new ArrayList<B>());
		passUpperBounded(new ArrayList<C>());
		passUpperBounded(new ArrayList<D>());
		
		List<? super IOException> exceptions2 = new ArrayList<Exception>();
		//exceptions.add(new Exception());     // DOES NOT COMPILE
		exceptions2.add(new IOException());
		exceptions2.add(new FileNotFoundException());
		
		//passUpperBoundedIO(new ArrayList<Exception>());
		passUpperBoundedIO(new ArrayList<IOException>());
		passUpperBoundedIO(new ArrayList<FileNotFoundException>());
		passUpperBoundedIO(new ArrayList<EOFException>());
		
	
	}
	
	public static void passUpperBounded(List<? extends B> list){
	}
	
	public static void passUpperBoundedIO(List<? extends IOException> list){
	}
}