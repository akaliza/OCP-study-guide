abstract class Shape {
	public static class Color {
		int m_red, m_green, m_blue;
		
		public Color() {
			this(0, 0, 0);
		}
		
		public Color(int red, int green, int blue) {
			m_red = red; m_green = green; m_blue = blue;
		}

		public String toString() {
			return " red = " + m_red + " green = " + m_green + " blue = " + m_blue;
		}
		
		// other color members elided
	}

	// other Shape members elided
}