public class Chimpanzee extends Primate { // Chimpanzee has-a Tail since it is-a Primate
	public static void main(String[] args){
		Chimpanzee c = new Chimpanzee();
		System.out.println("Tail: " + c.tail );
	}
}