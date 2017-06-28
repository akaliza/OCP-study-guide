public class AnonInner2{
	interface SaleTodayOnly {
		int dollarsOff();
	}
	
	public int pay() {
		return admission(5, new SaleTodayOnly() {
			public int dollarsOff() { return 3; }
		});
	}
 
	public int admission(int basePrice, SaleTodayOnly sale) {
		return basePrice - sale.dollarsOff();
	}
	
	public static void main(String[]  args){
		AnonInner2 an = new AnonInner2();
		System.out.println( "Result: " + an.pay() );
	}
}