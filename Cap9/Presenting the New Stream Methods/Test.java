import java.io.IOException;
import java.nio.file.*;
import java.util.stream.*;


public class Test {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:\\git");
		long dateFilter = 1420070400000l;
		
		try {
			Files.walk(path,4)  //deep 4
				.filter(p -> p.toString().endsWith(".java"))
				.forEach(System.out::println);
		} catch (IOException e) {
			// Handle file I/O exception...
		}
		
		
		try {
			Stream<Path> stream = Files.find(path, 10,
			(	p,a) -> p.toString().endsWith(".java")
				&& a.lastModifiedTime().toMillis()>dateFilter);
				stream.forEach(System.out::println);
		} catch (Exception e) {
			// Handle file I/O exception...
		}
		
	}
}