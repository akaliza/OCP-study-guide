import java.util.Optional;

public class Whiz60{
	
	public static void main(String[] args){
		
		Optional<Integer> ops = Optional.of(8);
		//fails to compile : public void ifPresent(Consumer<? super T> consumer)
		int i = ops.filter(p -> p > 8).ifPresent(System.out::print).orElse(0);
		System.out.println(i);		
	}

}