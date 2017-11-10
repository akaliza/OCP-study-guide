import java.io.FileNotFoundException;
import java.sql.SQLException;

class MultiCatch {
	public static void fooThrower() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
	
	public static void barThrower() throws SQLException {
		throw new SQLException();
	}
	
	public static void main(String []args) {
		try {
			fooThrower();
			barThrower();
		} catch(FileNotFoundException | SQLException multie) { // only | ; || does not compile
			System.out.println(multie);
		}
	}
}