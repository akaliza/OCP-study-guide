import java.util.Arrays;
public class WhizLab{	
	public static void main(String[] args){
		Value[] values = {Value.LOW, Value.HIGH,Value.MEDIUM};
		Arrays.sort(values);
		System.out.println(values[1]); // Enum<E> implements Comparable<E> via the natural order of the enum (the order in which the values are declared)
		System.out.println(values[0] + " " + values[1] +  " "  + values[2]);
	}
	
}

enum Value{
	HIGH(1),MEDIUM(6),LOW(3);
	
	private final int level; 
	
	private Value(int levelCode){ 
		level = levelCode; 
	}	

}