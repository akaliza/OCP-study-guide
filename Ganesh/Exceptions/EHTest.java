import java.sql.SQLException;

class CustomSQLException extends SQLException {}

class BaseClass {
	void foo() throws SQLException {
		throw new SQLException();
	}
}

class DeriClass extends BaseClass {
	public void foo() throws CustomSQLException { // LINE A
		throw new CustomSQLException();
	}
}

class EHTest {
	public static void main(String []args) {
		try {
			BaseClass base = new DeriClass();
			base.foo();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}