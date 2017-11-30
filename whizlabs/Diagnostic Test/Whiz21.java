import java.util.stream.Stream;

public class Whiz21{
	public static void main(String[] args){
		Stream<String> stream = Stream.of("A","AB","ABC","ABCD","AB");
		String out = stream.filter(s ->s.length() > 2 )
						.filter(s -> s.indexOf("C") >-1)
						.findFirst() //quando se utiliza orElse ele atribui como String e não Optional<String>
						.orElse("None"); 
		System.out.println(out);
	}


}