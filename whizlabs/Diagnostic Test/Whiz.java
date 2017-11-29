public class Whiz{
	
	static int i = 10; 
	
	public class Inner{
		public static void print(){ // tried to define static content inside a non static inner class
			System.out.println(i);
		} 
	}
	
	
	public static void main(String[] args){
		Inner in = new Whiz().new Inner();
		//in.print();
	}
	
}