class StatusReporter {
	
	/*You can pass only final variables to a local inner class. 
	If you don't declare a variable that a local inner
	class accesses, the compiler will treat it as effectively final.*/
	
	// important to note that the argument "color" is declared final
	static Shape.Color getDescriptiveColor(final Shape.Color color) {
		// local class DescriptiveColor that extends Shape.Color class
		class DescriptiveColor extends Shape.Color {
			public String toString() {
				return "You selected a color with RGB values" + color;
			}
		}
		
		return new DescriptiveColor();
	}
	
	public static void main(String []args) {
		Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(10, 15, 8));
		System.out.println(descriptiveColor);
	}
}