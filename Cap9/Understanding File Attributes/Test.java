import java.io.IOException;
import java.nio.file.*;

public class Test {
	
	public static void main(String[] args) throws IOException {
		System.out.println(Files.isReadable(Paths.get("C:/za1.txt")));
		System.out.println(Files.isExecutable(Paths.get("C:/za1.txt")));
	}
}