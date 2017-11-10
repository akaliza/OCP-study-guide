class ChainedException {
	public static void foo() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch(ArrayIndexOutOfBoundsException oob) {
			RuntimeException re = new RuntimeException(oob);
			re.initCause(oob); // at this point 
			throw re;
		}
	}
	public static void main(String []args) {
		try {
			foo();
		} catch(Exception re) {
			System.out.println(re.getClass()); //class java.lang.IllegalStateException
		}
	}
}