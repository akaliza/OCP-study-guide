public class Whiz2{}

class Outer{
	public static void main(String args[]){
		//Inner in = new Inner(); 
		//doesn't compile - we can't acess a non static class here
		
		
		Inner in = new Outer().new Inner();
		in.y = 10; 
		in.print();
	}
	
	//can acess inside a non static method
	public void call(){
		Inner in = new Inner();
		in.y = 20; 
		in.print();
	}
	
	class Inner{
		private int y = 0; 
		public void print(){
			System.out.println(y);
		}
	}
}