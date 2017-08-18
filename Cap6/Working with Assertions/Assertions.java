//java -ea Assertions or java -enableassertions Assertions
public class Assertions {
	public static void main(String[] args) {
		int numGuests = 15;
		assert numGuests > 0;
		
		
		assert isValid(): "Invalid value";
		System.out.println(numGuests);
	}
	
	public static boolean isValid(){
		return false;
	}
	
 }