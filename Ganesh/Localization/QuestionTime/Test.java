import java.util.Locale;
class Test {
	public static void main(String []args) {
		Locale locale1 = new Locale("en"); //#1
		Locale locale2 = new Locale("en", "in"); //#2
		Locale locale3 = new Locale("th", "TH", "TH"); //#3
		Locale locale4 = new Locale(locale3); //#4
		System.out.println(locale1 + " " + locale2 + " " + locale3 + " " + locale4);
	}
}