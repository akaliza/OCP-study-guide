import java.util.function.Predicate;
import java.util.stream.Stream;

public class Whiz46{
	public static void main(String[] args){
		Stream<Client> clients = Stream.of(new Client("Will","vps server",200),
										   new Client("Rachel","java program",1200),	
										   new Client("Anthony","Configuration",1000));
		Predicate<Client> func = e -> { System.out.print(e.getName() + " ");
										return e.getBudget() > 1000.0;
									  }; //lembrar do ;
		clients.noneMatch(func); //[Will Rachel]								
	}
}

class Client{
	double budget;
	String name;
	String project;

	Client(String n,String pr,double p){
		budget = p;
		name = n;
		project = pr;
	}

	public double getBudget(){
		return budget;
	}	
	
	public String getName(){
		return name;
	}
	
	public String getProject(){
		return project;
	}

	@Override
	public String toString(){
		return name + "," + budget;
	}
}