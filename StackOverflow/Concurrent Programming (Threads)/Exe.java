import java.util.concurrent.*;
import java.util.*; 

public class Exe {

	public static void main(String[] args) throws Exception {
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		System.out.println("Time At Task Submission : " + new Date());
		Future<String> result = es.submit(new ComplexCalculator());
		
		// the call to Future.get() blocks until the result is available.So we are in for about a 10 sec wait now
		System.out.println("Result of Complex Calculation is : " + result.get());
		System.out.println("Time At the Point of Printing the Result : " + new Date());
		
	}
}