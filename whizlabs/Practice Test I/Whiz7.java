import java.sql.*; 

public class Whiz7{}

class Pro2{
	public static void main(String args[]){
		DBConnect dc = new DBConnect();
	}
}
class DBConnect{
	private Connection con;
	public DBConnect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
			"jdb:mysql://localhost/whiz","root","whizlabs");
		//unreported exception SQLException; must be caught or declared to be thrown
		}catch(ClassNotFoundException | SQLException e){
			System.out.print(e);
		}
	}
}