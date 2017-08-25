import java.io.*;
import java.io.Console;

public class Interact{
	public static void main(String args[]) throws IOException {
		
		Console console = System.console();
		if(console != null) {
			String userInput = console.readLine();
			console.writer().println ("You entered the following: "+userInput);
		}
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userInput = reader.readLine();
		System.out.println("You entered the following: "+userInput);
	}
	
}