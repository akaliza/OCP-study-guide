public final class ImmutableCircle {
	private final Point center;
	private final int radius;
	
	public ImmutableCircle(int x, int y, int r) {
		center = new Point(x, y);
		radius = r;
	}
	
	public String toString() {
		return "center: " + center + " and radius = " + radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public Point getCenter() {
		// return a copy of the object to avoid
		// the value of center changed from code outside the class
		return new Point(center.getX(), center.getY());
	}
	
	public static void main(String []s) {
		System.out.println(new ImmutableCircle(10, 10, 20));
	}
	
	// other members are elided ...
}