import java.io.File;

public class FileSample {
	public static void main(String[] args) {
		File file = new File("c:\\HaxLogs.txt");
		System.out.println(file.exists());
	}
}