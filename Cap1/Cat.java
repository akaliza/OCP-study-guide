class Animal{
	protected String name = "Raul"; 
	public Object Rename(){
		return "OLA";
	}
	
}

public class Cat extends Animal{
	public static void main(String[] args){
		//Animal a = new Animal();
		//a.name = "Dolores"; in another package this don't compile
		Cat cat = new Cat();
		cat.name = "Alfredo";
		cat.printName();
		System.out.println(cat.Rename());
	}
	@Override
	public String Rename(){
		return "ALO"; 
	}
	
	public void printName(){
		System.out.println(name);
	}
} 