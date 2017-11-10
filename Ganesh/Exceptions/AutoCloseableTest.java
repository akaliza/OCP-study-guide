import java.util.Scanner;

class AutoCloseableTest {
	public static void main(String []args) {
		try (Scanner consoleScanner = new Scanner(System.in)) {
			consoleScanner.close(); // CLOSE
			consoleScanner.close();
		}
	}
}