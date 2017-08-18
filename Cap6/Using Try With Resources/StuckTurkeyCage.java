public class StuckTurkeyCage implements AutoCloseable {
	
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}
	
	public static void main(String[] args) throws Exception{
		try (StuckTurkeyCage t = new StuckTurkeyCage()) {
			System.out.println("put StuckTurkeyCage in");
		}
	}
}