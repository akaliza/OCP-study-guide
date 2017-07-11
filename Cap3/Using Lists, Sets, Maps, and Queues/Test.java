import java.util.*;

public class Test{
	
	public static void main(String... args){
		List<String> list = new ArrayList<>();
		list.add("OH");
		list.add("CO");
		list.add("NJ");
		String state = list.get(0);
		int index = list.indexOf("NJ");
		
		System.out.println(state); // OH
		System.out.println(index); // 2
		
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10)); // true
		System.out.println(queue.offer(4)); // true
		System.out.println(queue.peek()); // 10
		System.out.println(queue.poll()); // 10
		System.out.println(queue.poll()); // 4
		System.out.println(queue.peek()); // null
		
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);
		stack.push(4);
		System.out.println(stack.peek()); // 4
		System.out.println(stack.poll()); // 4
		System.out.println(stack.poll()); // 10
		System.out.println(stack.peek()); // null
	}
}