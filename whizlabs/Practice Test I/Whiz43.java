import java.io.*;

public class Whiz43{
	
	public static void main(String[] args) throws IOException {
		int i; 
		InputStream in = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		try{
			i = br.read();
			System.out.print("ASCII value of " + (char) i + " is " + i );
		}catch(IOException e){
			System.out.print("IOException");
		}
		
	}

}