class Ttest implements Runnable{
	public static void main(String[] args){
		Ttest a1 = new Ttest();
		Thread t = new Thread(a1); 
		t.setName("a1");
		t.start(); 
		System.out.println(Thread.currentThread().getName() + ""); //main
		try{
			t.join();
		}catch(Exception e){}
		System.out.println(Thread.currentThread().getName()); //main
	}
	public void run(){
		System.out.println(Thread.currentThread().getName() + ""); //a1	
	}
}

/*
The join method allows one thread to wait for the completion of another. 
If t is a Thread object whose thread is currently executing,

t.join();
causes the current thread to pause execution until t's thread terminates.
*/