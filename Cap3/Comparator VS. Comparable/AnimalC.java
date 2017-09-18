import java.util.*;
public class AnimalC implements Comparable<AnimalC> {
	private Integer id;
	
	public int compareTo(AnimalC a) {
		return id.compareTo(a.id);
	}
	
	public AnimalC(Integer id) {
		this.id = id;
	} 
	
	public String toString() { // use readable output
		return String.valueOf(id);
	}
	
	public static void main(String[] args) {
		List<AnimalC> a = new ArrayList<>();
		a.add(new AnimalC(5));
		a.add(new AnimalC(31));
		a.add(new AnimalC(7));
		Collections.sort(a);  
		System.out.println(a); // 5,7,31
		
	} 
}