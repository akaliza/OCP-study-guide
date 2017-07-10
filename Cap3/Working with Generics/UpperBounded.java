import java.util.*;

public class UpperBounded{
	
	List<? extends Number> list = new ArrayList<Integer>();
	
	public static void main(String[] args){
		UpperBounded up = new UpperBounded();
		//up.list.add(new Integer(10));
		
		total(up.list);
	}
	
	
	public static long total(List<? extends Number> list) {
		long count = 0;
		for (Number number: list)
			count += number.longValue();
		return count;
	}

}