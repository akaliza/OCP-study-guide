// Lazy instantiation
public class VisitorTicketTracker {
	private static VisitorTicketTracker instance;
	
	private VisitorTicketTracker() {
	}
	
	public static synchronized VisitorTicketTracker getInstance() {
		if(instance == null) {
			instance = new VisitorTicketTracker(); // NOT THREAD-SAFE! -- add the synchronized turn into THREAD-SAFE!
		}
		return instance;
	}
	
	// Data access methods
	// ... 
}