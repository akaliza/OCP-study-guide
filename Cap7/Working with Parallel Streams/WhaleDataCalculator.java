import java.util.*;


public class WhaleDataCalculator {
	
	public int processRecord(int input) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// Handle interrupted exception
		}
		return input+1;
	}

	public void processAllData(List<Integer> data) {
		//data.stream().map(a -> processRecord(a)).count(); 40.164
		data.parallelStream().map(a -> processRecord(a)).count(); //10.066
	}
	
	public static void main(String[] args) {
		WhaleDataCalculator calculator = new WhaleDataCalculator();
		// Define the data
		List<Integer> data = new ArrayList<Integer>();
		for(int i=0; i<4000; i++) data.add(i);
		// Process the data
		long start = System.currentTimeMillis();
		calculator.processAllData(data);
		double time = (System.currentTimeMillis()-start) / 1000.0;
		// Report results
		System.out.println("\nTasks completed in: "+time+" seconds");
	}
}