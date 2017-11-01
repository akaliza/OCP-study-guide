// This program shows container implementation using generics
class BoxPrinter<T> {
	private T val;
	public BoxPrinter(T arg) {
		val = arg;
	}
	public String toString() {
		return "[" + val + "]";
	}
}

public class BoxPrinterTest {
	public static void main(String []args) {
		BoxPrinter<Integer> value1 = new BoxPrinter<>(new Integer(10));
		System.out.println(value1);
		BoxPrinter<String> value2 = new BoxPrinter<>("Hello world");
		System.out.println(value2);
	}
}