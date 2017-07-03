public class Tiger implements Sprint {
	public void sprint(Animal animal) {
		System.out.println("Animal is sprinting fast! "+animal.toString());
	}
	public static void main(String[] args){
		Tiger t = new Tiger();
		Animal a = new Animal();
		t.sprint(a);
	}
}