class Ttest implements Runnable{
	public static void main(String[] args){
		Ttest a1 = new Ttest();
		Thread t = new Thread(a1); 
		t.setName("a1");
		t.start(); 
		System.out.println(Thread.currentThread().getName() + "");
		try{
			t.join();
		}catch(Exception e){}
		System.out.println(Thread.currentThread().getName());
	}
	public void run(){
		System.out.println(Thread.currentThread().getName() + "");	
	}
}