import java.util.*; 

public class TestQuestion {
	private int value; 
	
	public TestQuestion(int value) {
		this.value = value;
	}
	/*
	public TestQuestion(Integer value) {
		this.value = value + 50;
	}
	*/
	
	public static void main(String...args){
		Integer code = 100; 
		TestQuestion t = new TestQuestion(code);
		System.out.println(t.value);
		
	}
 }