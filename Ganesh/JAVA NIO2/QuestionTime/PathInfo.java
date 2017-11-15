import java.nio.file.*;

public class PathInfo {
	public static void main(String[] args) {
		Path aFilePath = Paths.get("D:\\directory\\file.txt");
		
		// FILEPATH
		while(aFilePath.iterator().hasNext()) {
			System.out.println("path element: " + aFilePath.
			iterator().next());
		}
	}
}