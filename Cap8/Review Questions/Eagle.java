import java.io.Serializable;

public class Eagle extends Bird implements Serializable {
	{ this.name = "Janette"; }	
	
	public Eagle() { //call super and name is transient 
		this.name = "Daniel";
	}
}