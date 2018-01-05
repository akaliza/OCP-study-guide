public class Whiz18{
	public static void main(String[] args){
		int j = 9; 
		assert(++j > 7) : "Error";
		assert(j==12): j;
		//doesn't compile, the second expression of assert must return a value
		//assert(++j > 8) : System.out.println(j); 
		assert(j==12): new Whiz18();
	}

}