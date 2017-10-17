
import java.io.Serializable;

public class Zebra implements Serializable {
	
	private static final long serialUID = 1L; //serialVersionUID, but compiles.  
	private transient String name = "George"; //transient
	private static String birthPlace = "Africa"; //static
	private transient Integer age; //transient
	private java.util.List<Zebra> friends = new java.util.ArrayList<>();  //a serialized empty array is not the same as a null pointer
	private Object tail = null;  //could be set by a caller before being serialized
	
	{ age = 10;}
	
	public Zebra() {
		this.name = "Sophia";
	}
}