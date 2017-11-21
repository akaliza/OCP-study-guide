import java.util.stream.*;

class MockTest {
	public static void main(String []args) {
		   
	}
	
	public static void question1(){
		Stream.of("ace ", "jack ", "queen ", "king ", "joker ")
			.mapToInt(card -> card.length()) //3 , 4 , 5 , 4 , 5 
			.filter(len -> len > 3) // 4 , 5 , 4 , 5 
			.peek(System.out::print) // 
			.limit(2); // 4 , 5
	}
	
	public static void question2(){
		int ch = 0;
		try (FileReader inputFile = new FileReader(file)) {
			while( (ch = inputFile.read()) != -1) {
				System.out.print( (char)ch );
			}
		}
	}

	
	
}