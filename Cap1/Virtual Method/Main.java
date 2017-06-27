abstract class Animal {
	public abstract void feed(); 
}

class Cow extends Animal {
	public void feed() { addHay(); }
	private void addHay() { }
}

class Bird extends Animal {
	public void feed() { addSeed(); }
	private void addSeed() { }
}
class Lion extends Animal {
	public void feed() { addMeat(); }
	private void addMeat() { }
}

public class Main{
    public static void main(String[] args){
    	System.out.println("[OLA]");
    }		
}