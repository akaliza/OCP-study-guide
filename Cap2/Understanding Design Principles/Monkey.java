public class Monkey extends Primate { // Monkey has-a Tail since it is-a Primate
	public static void main(String[] args){
		Monkey m = new Monkey();
		System.out.println("Tail: " + m.tail );
	}
}
