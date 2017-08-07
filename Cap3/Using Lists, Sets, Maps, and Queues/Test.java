import java.util.*;

public class Test{
	
	public void set(){
		
	} 
	
	public void printHashMap(){
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala"); // bamboo
		for (String key: map.keySet())
			System.out.print(key + ","); // koala,giraffe,lion,
		System.out.println(); 
	}
	
	public void printTreeMap(){
		Map<String, String> map = new TreeMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meat");
		map.put("giraffe", "leaf");
		String food = map.get("koala"); // bamboo
		for (String key: map.keySet())
			System.out.print(key + ","); // giraffe,koala,lion,
		System.out.println();
	}
	
	
	public static void main(String... args){
		
		Test t = new Test();
		t.set();
		t.printHashMap();
		t.printTreeMap();
		
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