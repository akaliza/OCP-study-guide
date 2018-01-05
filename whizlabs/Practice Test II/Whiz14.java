import java.io.*;

class NegativeException extends RuntimeException{}
class NotEnoughException extends Exception{}
class Lone{
	int amount;
	public boolean setAmount(int am) throws NotEnoughException{
		if(am < 0){
			throw new NegativeException();
		}else if(am < 500){
			throw new NotEnoughException();
		}else{
			amount = am;
			return true;
		}
	}
}

public class Whiz14{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Lone d = new Lone();
		System.out.print("Enter the amount : ");
		try{
			int i = Integer.parseInt(br.readLine());
			d.setAmount(i); //here catch the NotEnoughException or Exception
		}catch(NegativeException E){
			System.out.print(E);
		}catch(IOException E){
			System.out.print(E);
		}
		
		
		System.out.print(d.amount);
	}

}