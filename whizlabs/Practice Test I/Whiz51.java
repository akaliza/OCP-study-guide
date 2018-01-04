import java.util.*;

public class Whiz51{
	public static void main(String[] args){
		List<Client> clients = new ArrayList<>();
		clients.add(new Client("Will","vps server",200));
		clients.add(new Client("Rachel","java program",1200));	
		clients.add(new Client("Raj","PHP server",750));
		
		Collections.sort(clients,Comparator.comparing(Client::getName));
		System.out.println(clients); // Rachel - Raj - Will		
	}
}