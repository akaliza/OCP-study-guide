import java.nio.file.*;
import java.io.IOException;
class PathExists {
	public static void main(String []args) throws IOException {
		Path aFilePath = Paths.get("D:\\directory\\file.txt");
		System.out.println(aFilePath.isAbsolute()); 
	}
}