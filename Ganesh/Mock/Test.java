class Base {
	public Base() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public Derived() {
		System.out.println("Derived");
	}
}

class DeriDerived extends Derived {
	public DeriDerived() {
		System.out.println("DeriDerived");
	}
}
class Test {
	public static void main(String []args) {
		Derived b = new DeriDerived();
	}
}

//Base Derived DeriDerived