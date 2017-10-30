// Point is a mutable class
class Point {
	private int xPos, yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public String toString() {
		return "x = " + xPos + ", y = " + yPos;
	}
	
	int getX() { 
		return xPos; 
	}
	int getY() { 
		return yPos; 
	}
}