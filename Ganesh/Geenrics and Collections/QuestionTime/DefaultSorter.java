import java.util.Arrays;

class DefaultSorter {
	public static void main(String[] args) {
		String[] brics = {"Brazil", "Russia", "India", "China"};
		Arrays.sort(brics, null); // LINE A
		for(String country : brics) {
			System.out.print(country + " ");
		}
	}
}

/*
C. When executed, the program prints the following: Brazil China India Russia

E. When executed, the program throws a runtime exception of
NullPointerException when executing the line marked with comment LINE A

*/