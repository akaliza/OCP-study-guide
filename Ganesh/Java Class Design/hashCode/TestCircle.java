// This program shows the importance of overriding equals() and hashCode() methods
import java.util.*;

class Circle {
	private int xPos, yPos, radius;
	
	public Circle(int x, int y, int r) {
		xPos = x;
		yPos = y;
		radius = r;
	}
	
	@Override
	public boolean equals(Object arg) {
		if(arg == null) return false;
		if(this == arg) return true;
		if(arg instanceof Circle) {
			Circle that = (Circle) arg;
			if( (this.xPos == that.xPos) && (this.yPos == that.yPos)
			&& (this.radius == that.radius )) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// use bit-manipulation operators such as ^ to generate close to unique
		// hash codes here we are using the magic numbers 7, 11 and 53,
		// but you can use any numbers, preferably primes
		return (7 * xPos) ^ (11 * yPos) ^ (53 * yPos);
	}
}

public class TestCircle {
	public static void main(String []args) {
		Set<Circle> circleList = new HashSet<Circle>();
		circleList.add(new Circle(10, 20, 5));
		System.out.println(circleList.contains(new Circle(10, 20, 5)));
	}
}