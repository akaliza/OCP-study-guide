public class Browsers {
	
	static class Browser {
		public void go() {
			System.out.println("Inside Browser");
		}
	}
	
	static class Firefox extends Browser {
		public void go() {
			System.out.println("Inside Firefox");
		}
	}
	
	static class IE extends Browser {
		@Override 
		public void go() {
		System.out.println("Inside IE");
		}
	}

	public static void main(String[] args) {
		Browser b = new Firefox(); 
		IE e = (IE) b; /*Exception => Browsers$Firefox cannot be cast to Browsers$IE Ie e = (Firefox) browser--*/
		e.go(); 
	}
}