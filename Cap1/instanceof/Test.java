public class Test{
	public static void main(String[] args){
		HeavyAnimal hippo = new Hippo();
		             /*son   ---      father*/  
		boolean b1 = hippo instanceof Hippo; // true
		boolean b2 = hippo instanceof HeavyAnimal; // true
		boolean b3 = hippo instanceof Elephant; // false
		System.out.println("b1:" + b1 + "b2:" + b2 + "b3" + b3);
	
		boolean b4 = hippo instanceof Object; // true
		Hippo nullHippo = null;
		boolean b5 = nullHippo instanceof Object; // false
		System.out.println("b4:" + b4 + "b5:" + b5 );
	
		Hippo anotherHippo = new Hippo();
		//boolean b6 = anotherHippo instanceof Elephant;  DOES NOT COMPILE -- Não tem, relação nenhuma com ELEFANTE 
		
		boolean b6 = hippo instanceof Mother;
		System.out.println("b6:" + b6 );
		/*class MotherHippo extends Hippo implements Mother { } can be implemented in the futere*/
		
		
		
	
	}
}