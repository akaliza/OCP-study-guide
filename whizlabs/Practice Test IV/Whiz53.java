import java.util.Optional;
import java.util.stream.Stream;

class Whiz53{
	public static void main(String[] args){
		Stream<Integer> s = Stream.of(12,40,11,22);
		Optional<Integer> min = s.filter((Integer p) -> p%2 ==0).min(); //min expects an Comparator as argument
		System.out.println(min);
	}	

}