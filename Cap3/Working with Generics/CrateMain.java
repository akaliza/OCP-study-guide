class Elephant{}

public class CrateMain{
	private static final int number = 1_005;
	public static void main(String...args){
		Elephant elephant = new Elephant();
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCrate(elephant);
		Elephant inNewHome = crateForElephant.emptyCrate();
		
		Crate<Number> createSon = crateForElephant.ship(number);
		
		//without generics 
		Crate crateRawType = new Crate();
		
	}
}