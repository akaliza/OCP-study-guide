abstract class Shape {
	public abstract Shape copy();
}
class Circle extends Shape {
	private int x,y,z; 
	
	
	public Circle(int x, int y, int radius) { 
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/*
	public Shape copy() { 
		return this;
	}
	*/
	
	public Circle copy() { 
		return this;
	}
	
}

public class Test {
	public static void main(String []args) {
		Circle c1 = new Circle(10, 20, 30);
		//Circle c2 = (Circle) c1.copy();
		Circle c2 = c1.copy();
	}
}