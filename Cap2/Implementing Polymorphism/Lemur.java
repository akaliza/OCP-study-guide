public class Lemur extends Primate implements HasTail {
	public int age = 10;

	public boolean isTailStriped() {
		return false;
	}

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age); //10
		HasTail hasTail = lemur; //ok
		System.out.println(hasTail.isTailStriped()); //false
		Primate primate = lemur; //ok  Class Pai   = SUBClass
		System.out.println(primate.hasHair()); //true
		
		/*
		System.out.println(hasTail.age); // DOES NOT COMPILE
		System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
		*/
	}
}