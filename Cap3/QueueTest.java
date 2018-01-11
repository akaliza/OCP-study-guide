import java.util.*; 

public class QueueTest{    
	public static void main(String args[]){       
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10)); 
		System.out.println(queue.offer(4)); 
		System.out.println(queue.offer(3));
		System.out.println(queue.offer(1));
		System.out.println(queue); //10,4,3,1
		System.out.println(queue.pool()); // 10
		System.out.println(queue);	//4,3,1
	}		
		
}