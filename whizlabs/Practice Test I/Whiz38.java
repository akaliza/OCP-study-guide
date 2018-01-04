import java.nio.file.*;
import java.io.*;

public class Whiz38{
	
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("F:\\Whizlabs\\java\\NIO\\myfiles");
		Path path2 = Paths.get("F:\\Whizlabs\\java\\NIO\\myfiles\\data");
		
		System.out.println(path1.relativize(path2).toString()); //data
		System.out.println(path2.relativize(path1).toString()); // ..
	}

}