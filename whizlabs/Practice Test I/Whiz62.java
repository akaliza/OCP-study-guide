import java.util.function.DoubleFunction;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Whiz62{
	
	public static void main(String[] args){
		
		Stream<Client> clients = Stream.of(new Client("Will","vps server",200),
										   new Client("Rachel","java program",1200),	
										   new Client("Anthony","Configuration",1000));

		//return a double but declares a Client 								   
		DoubleFunction<Client>	func = Client::getBudget;
		DoubleStream prices = clients.mapToDouble(func);
		prices.forEach(d -> System.out.print(d + " "));	
	}

}
/*
@FunctionalInterface
public interface DoubleFunction<R>{
   R apply(double value)
}
*/