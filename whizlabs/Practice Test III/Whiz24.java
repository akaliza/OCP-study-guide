import java.util.ArrayDeque;

public class Whiz24{
	public static void main(String[] args){
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.add(10); 
		dq.add(20);
		dq.add(30);
		dq.add(40); //[10,20,30,40]
		System.out.println(dq.element() + dq.poll()); //[10] + [10]
	}
}	
