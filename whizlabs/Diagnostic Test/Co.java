import java.io.Console;

public class Co{
	public static void main(String[] args){
		Console con = System.console();
		String s = con.readPassword("Password: "); //readPassword return a array of chars
		if(s.equals("Rekha")){
			System.out.print("Welcome");
		}else{
			System.out.print("Sorry");
		} 
	}
}