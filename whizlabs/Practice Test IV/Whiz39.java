import java.nio.file.*;
import java.io.*;

class Whiz39{
	public static void main(String[] args) throws IOException{
	   Path path1 = Paths.get("F:\\Whizlabs\\java\\NIO");
	   Path path2 = Paths.get("c:\\output");
	   Path path = Paths.get(path2.getRoot().toString(),     //c:| 
	                         path1.subpath(0,3).toString()); // Whizlabs|java|NIO
	   System.out.println(path.toString());	// c:|Whizlabs|java|NIO
	}	

}