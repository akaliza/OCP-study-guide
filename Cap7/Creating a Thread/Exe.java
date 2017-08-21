public class Exe{
	public static void main(String[] args) {
		System.out.println("begin");
		
		(new ReadInventoryThread()).start();
		(new Thread(new PrintData())).start();
		(new ReadInventoryThread()).start();
		 
		/*** none will actually execute a task on a separate processing thread
		new PrintData().run();
		(new Thread(new PrintData())).run();
		(new ReadInventoryThread()).run();
		**/
		System.out.println("end");
	}
}