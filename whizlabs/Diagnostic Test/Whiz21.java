import java.util.stream.Stream;

public class Whiz21{
	public static void main(String[] args){
		Stream<String> stream = Stream.of("A","AB","ABC","ABCD","AB");
		String out = stream.filter(s ->s.length() > 2 )
						.filter(s -> s.indexOf("C") >-1)
						.findFirst() //imaginei que teria que ter o get(), pois a definição do metodo é: Optional<T> findFirst()
						.orElse("None"); 
		System.out.println(out);
	}


}