import java.io.IOException;
import java.nio.file.*;

public class Test {
	
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:\\git");
		try {
			Files.walk(path)
				.filter(p -> p.toString().endsWith(".java"))
				.forEach(System.out::println);
		} catch (IOException e) {
			// Handle file I/O exception...
		}
	}
}