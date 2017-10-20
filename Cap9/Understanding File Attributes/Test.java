import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;

public class Test {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/za1.txt");
		
		System.out.println(Files.isReadable(path));
		System.out.println(Files.isExecutable(path));
		System.out.println(Files.size(path));
		
		System.out.println(Files.getLastModifiedTime(path).toMillis());
		Files.setLastModifiedTime(path,FileTime.fromMillis(System.currentTimeMillis()));
		System.out.println(Files.getLastModifiedTime(path).toMillis());
		
		
	}
}