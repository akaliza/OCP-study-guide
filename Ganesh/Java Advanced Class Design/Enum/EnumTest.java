// define an enum for classifying printer types
enum PrinterType {
	DOTMATRIX(5), INKJET(10), LASER(50);
	
	private int pagePrintCapacity;
	
	private PrinterType(int pagePrintCapacity) {
		this.pagePrintCapacity = pagePrintCapacity;
	}
	
	public int getPrintPageCapacity() {
		return pagePrintCapacity;
	}

}

// test the enum now
public class EnumTest {
	
	PrinterType printerType;
	
	public EnumTest(PrinterType pType) {
		printerType = pType;
	}
	
	public void feature() {
		// switch based on the printer type passed in the constructor
		switch(printerType){
			case DOTMATRIX:
				System.out.println("Dot-matrix printers are economical and almost obsolete");
				break;
			case INKJET:
				System.out.println("Inkjet printers provide decent quality prints");
				break;
			case LASER:
				System.out.println("Laser printers provide best quality prints");
				break;
		}
		System.out.println("Print page capacity per minute: " + printerType.getPrintPageCapacity());
	}
	
	public static void main(String[] args) {
		EnumTest enumTest1 = new EnumTest(PrinterType.LASER);
		enumTest1.feature();
		EnumTest enumTest2 = new EnumTest(PrinterType.INKJET);
		enumTest2.feature();
	}
	
}