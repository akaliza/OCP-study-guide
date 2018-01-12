public class StringExample{    
	public static void main(String args[]){       
		String a = new String("abcd");
		System.out.println(a.substring(2,3)); //"c"
		System.out.println(a.substring(2,2)); //""
		System.out.println(a.substring(2,1)); //StringIndexOutOfBoundsException
	}		
		
}