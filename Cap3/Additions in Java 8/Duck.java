import java.util.*;
public class Duck implements Comparable<Duck> {
	private String name;
	private int weight;
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() { return name; }
	
	public int getWeight() { return weight; }

	public String toString() { // use readable output
		return name;
	}
	
	public int compareTo(Duck d) {
		return name.compareTo(d.name); // call String's compareTo
	}
	
	public static void main(String[] args) {
		Comparator<Duck> byWeight = new Comparator<Duck>() {
			public int compare(Duck d1, Duck d2) {
				return d1.getWeight() - d2.getWeight();
			}
		};
		
		
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack", 7));
		ducks.add(new Duck("Puddles", 10));
		Collections.sort(ducks); // sort by name
		System.out.println(ducks); // [Puddles, Quack]
		Collections.sort(ducks, byWeight);
		System.out.println(ducks); // [Quack, Puddles]
	}
}