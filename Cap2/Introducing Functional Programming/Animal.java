public class Animal{
	private String name; 
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public Animal(){
		this.name = "Animal Default"; 
	}
	
	public boolean canHop()  { return canHop; }
	public boolean canSwim() { return canSwim; }
	@Override
	public String toString() { return species; }
	
	
	
}