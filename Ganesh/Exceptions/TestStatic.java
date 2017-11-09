import java.util.*; 
import java.io.*;
import java.sql.SQLException; 
 
public class TestStatic {
	public static void main(String args[]) throws IOException {
		toUpper("call");
	}
	
	private static int toUpper(String str) throws IOException  {
		Scanner consoleScanner = new Scanner(new File("integer.txt"));
		return consoleScanner.nextInt();
	}
	
	//if a non static inicialization block throw a checked exception we need to define there in the constructor
	public TestStatic() throws SQLException{ 
		
	}
	
	//non static inicialization block can throw a checked exception // static inicialization block cannot  
	{
       try {
            TestStatic t = new TestStatic();
       }
       catch (SQLException  e) {
            throw new SQLException(e);
       }
    }
	
	
}