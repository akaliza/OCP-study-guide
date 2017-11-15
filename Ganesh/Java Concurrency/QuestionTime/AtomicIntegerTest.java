import java.util.concurrent.atomic.*;
class AtomicIntegerTest {
	static AtomicInteger ai = new AtomicInteger(10);
	
	public static void check() {
		assert (ai.intValue() % 2) == 0;
	}
	
	public static void increment() {
		ai.incrementAndGet();
	}
	
	public static void decrement() {
		ai.getAndDecrement();
	}
	
	public static void compare() {
		ai.compareAndSet(10, 11);
	}
	
	public static void main(String []args) {
		System.out.println("1 : " + ai);
		increment();
		System.out.println("2 : " + ai);
		decrement();
		System.out.println("3 : " + ai);
		compare();
		System.out.println("4 : " + ai);
		check();
		System.out.println(ai);
	}
}