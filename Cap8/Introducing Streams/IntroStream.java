import java.io.*;

/*
Class Name 			Low/High 			Level Description
InputStream 		N/A 				The abstract class all InputStream classes inherit from

OutputStream 		N/A 				The abstract class all OutputStream classes inherit from

Reader 				N/A 				The abstract class all Reader classes inherit from

Writer 				N/A 				The abstract class all Writer classes inherit from

FileInputStream 	Low 				Reads file data as bytes

FileOutputStream 	Low 				Writes file data as bytes

FileReader 			Low 				Reads file data as characters

FileWriter 			Low 				Writes file data as characters

BufferedReader 		High 				Reads character data from an existing Reader in
										a buffered manner, which improves efficiency
										and performance

BufferedWriter 		High 				Writes character data to an existing Writer in a
										buffered manner, which improves efficiency and
										performance

ObjectInputStream 	High 				Deserializes primitive Java data types and graphs
										of Java objects from an existing InputStream

ObjectOutputStream 	High 				Serializes primitive Java data types and graphs
										of Java objects to an existing OutputStream

InputStreamReader 	High 				Reads character data from an existing InputStream

OutputStreamWriter 	High 				Writes character data to an existing OutputStream 

PrintStream   		High 				Writes formatted representations of Java
										objects to a binary stream

PrintWriter 		High 				Writes formatted representations of Java
										objects to a text-based output stre

*/




public class IntroStream{
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException{
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("zoo-data.txt"))) {
			System.out.println(bufferedReader.readLine());
		}
		
		System.out.println("#####");
		
		
		InputStream is = new BufferedInputStream(new FileInputStream("alfa.txt")); //ABCD
		System.out.print ((char)is.read()); //A
		if(is.markSupported()) {
			is.mark(100); 
			System.out.print((char)is.read()); //B 
			System.out.print((char)is.read()); //C 
			is.reset(); //- then call reset and return to the B
		}
		System.out.print((char)is.read()); //B
		System.out.print((char)is.read()); //C
		System.out.print((char)is.read()); //D 
		
		System.out.println();
		
		InputStream isa = new BufferedInputStream(new FileInputStream("animals.txt")); //TIGERS
		System.out.print ((char)isa.read()); //T
		isa.skip(2); // skip IG
		isa.read(); // don't put E
		System.out.print((char)isa.read()); //R
		System.out.print((char)isa.read()); //S

		
		
		
		/*
		try (ObjectInputStream objectStream = new ObjectInputStream(
											  new BufferedInputStream(
											  new FileInputStream("zoo-data.txt")))) {
			System.out.println(objectStream.readObject());
		}
	    */
		
		/*
		new BufferedInputStream(new FileReader("zoo-data.txt")); // DOES NOT COMPILE
		new BufferedWriter(new FileOutputStream("zoo-data.txt")); // DOES NOT COMPILE
		new ObjectInputStream(new FileOutputStream("zoo-data.txt")); // DOES NOT COMPILE
		new BufferedInputStream(new InputStream()); // DOES NOT COMPILE
		*/
	}
	
}