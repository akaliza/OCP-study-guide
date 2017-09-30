import java.util.concurrent.*;

public class ComplexCalculator implements Callable<String> {

    @Override
    public String call() throws Exception {
        // just sleep for 10 secs to simulate a lengthy computation
        Thread.sleep(10000);            
        System.out.println("Result after a lengthy 10sec calculation");
        return "Complex Result"; // the result 
    }
}