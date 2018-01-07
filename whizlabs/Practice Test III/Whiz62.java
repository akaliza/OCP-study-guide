import java.util.stream.*;

public class Whiz62{
	public static void main(String[] args){
		Stream<Double> stream = Stream.of(12.1,12.5,12.9); 
		//result a compile error since it doesn't return a stream 	
		//Stream<Integer> list  = stream.flatMap(d -> d.intValue()); 
		Stream<Integer> list  = stream.flatMap(d -> Stream.of(d.intValue()));
		System.out.println(list.collect(Collectors.toSet()));
	}
}	