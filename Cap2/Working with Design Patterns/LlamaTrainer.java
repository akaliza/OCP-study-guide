public class LlamaTrainer {
	
	public static void main(String[] args){
		LlamaTrainer l = new LlamaTrainer();
		l.feedLlamas(5);
		l.feedLlamas(1);
		l.feedLlamas(1);
		l.feedLlamas(1);
	}
	
	public boolean feedLlamas(int numberOfLlamas) {
		int amountNeeded = 5 * numberOfLlamas;
		HayStorage hayStorage = HayStorage.getInstance();
		if(hayStorage.getHayQuantity() < amountNeeded) {
			hayStorage.addHay(amountNeeded + 10);
		}
		boolean fed = hayStorage.removeHay(amountNeeded);
		if(fed) System.out.println("Llamas have been fed: " + hayStorage.getHayQuantity() );
		return fed;
	}
}