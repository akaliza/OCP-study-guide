class ExceptionTest {
	public static void foo() throws Exception{
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch(ArrayIndexOutOfBoundsException oob) {
			throw new Exception(oob); // doesn't compile at this point need to be throws 
		}
	}
	public static void main(String []args) {
		try {
			foo();
		} catch(Exception re) {
			System.out.println(re.getCause()); 
		}
	}
}