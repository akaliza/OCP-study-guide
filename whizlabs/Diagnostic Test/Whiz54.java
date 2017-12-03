import java.util.Optional;
import java.util.OptionalInt;

public class Whiz54{
	public static void main(String[] args){
		Optional<String> ops = Optional.of("1");
		OptionalInt op = ops.map(Integer::parseInt); //public <U> Optional<U> map(Function<? super T,? extends U> mapper)
		System.out.print(op);
	}
}