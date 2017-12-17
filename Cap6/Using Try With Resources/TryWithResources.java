public class TryWithResources implements AutoCloseable {

	public void close() throws IllegalStateException {
		System.out.println("excep 1");
		throw new IllegalStateException("excep 1 ");
	}
	
	public static void main(String[] args) {
		try (TryWithResources t = new TryWithResources();) {
			System.out.println("inside try");
			throw new RuntimeException("RunTime Exception");
		} catch (IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
		}
	}
}