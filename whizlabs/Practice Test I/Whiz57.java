import java.util.stream.DoubleStream;

public class Whiz57{
	
	public static void main(String[] args){
		DoubleStream dbs = DoubleStream.of(1.1,1.0,0.8,0.6,1.5);
		boolean value = 
		
		dbs.skip(2) // 0.8,0.6,1.5
			.peek(in -> System.out.println((int)in )) //1[0] 2[0]          0.8,0.6,1.5
			.limit(2) //1[0.8] 2[0.6]
			.allMatch(d -> d < 1); //true
			
		System.out.println("value: " + value);	
		
	}

}