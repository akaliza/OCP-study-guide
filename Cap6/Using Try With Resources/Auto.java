public class Auto implements AutoCloseable {
	int num;
	
	Auto(int num) { 
		this.num = num; 
	}
	
	public void close() {
		System.out.println("Close: " + num); //2 
	}
	
	public static void main(String[] args) {
		try (Auto a1 = new Auto(1); 
		     Auto a2 = new Auto(2)) {
			throw new Exception(); 
		} catch (Exception e) {
			System.out.println("ex");
		} finally {
			System.out.println("finally");
		}
	}
}

//close2 close1 EXFinally