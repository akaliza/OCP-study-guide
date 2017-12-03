import java.io.*;
import java.nio.file.*;



public class NIO{
	public static void main(String[] args){
		Path path1 = Paths.get("F:\\Whizlabs\\java\\NIO");
		Path path2 = Paths.get("c:\\output");
		Path path  = Paths.get(path2.getRoot().toString(),      //c:|
							   path1.subpath(0,3).toString());  //Whizlabs|java|NIO 
		System.out.print(path.toString()); // c:|Whizlabs|java|NIO
	}
}