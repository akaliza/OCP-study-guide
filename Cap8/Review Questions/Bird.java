import java.io.Serializable;

public class Bird implements Serializable {
	protected transient String name = "Bridget"; //transient
	
	/*getter and setter*/
	public void setName(String name) { 
		this.name = name; 
	}
	public String getName() { 
		return name; 
	}

	public Bird() {
		this.name = "Matt";
	}
}