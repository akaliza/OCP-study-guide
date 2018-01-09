 import java.io.IOException;  
 public class Device2 implements AutoCloseable{     
	String header = null;     
	public Device2(String name) throws IOException{         
		header = name;         
		if("D2".equals(name)) throw new IOException("Unknown");         
		System.out.println(header + " Opened");             
	}      
	public String read() throws IOException{         
		return "";     
	}          
	public void close(){         
		System.out.println("Closing device "+header);         
		throw new RuntimeException("RTE while closing "+header);     
	}          
	public static void main(String[] args) throws Exception {         
		try(Device2 d1 = new Device2("D1");             
			Device2 d2 = new Device2("D2")){             
			throw new Exception("test");         
		}     
	}      
}

/*
D1 Opened
Closing device D1
Exception in thread "main" java.io.IOException: Unknown
        at Device2.<init>(Device2.java:6)
        at Device2.main(Device2.java:18)
        Suppressed: java.lang.RuntimeException: RTE while closing D1
                at Device2.close(Device2.java:14)
                at Device2.main(Device2.java:20)
*/				