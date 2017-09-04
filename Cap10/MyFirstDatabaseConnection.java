import java.sql.*;

public class MyFirstDatabaseConnection {
	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby:zoo";
		try (Connection conn = DriverManager.getConnection(url);
			/*Class.forName("org.postgresql.Driver");| throws ClassNotFoundException*/
			Statement stmt = conn.createStatement();
			/*
			Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			
			TYPE_FORWARD_ONLY [default]
			TYPE_SCROLL_INSENSITIVE [changed in the table, will be changed in the query]
			TYPE_SCROLL_SENSITIVE[get the latest data from Database Table] - not supported well
			
			CONCUR_READ_ONLY[default] - You can’t update the result set.
			CONCUR_UPDATABLE -  Lets you modify the database through the ResultSet [is not universally supported].
			
			*/
			
			ResultSet rs = stmt.executeQuery("select name from animal")) {
			while (rs.next())
				System.out.println(rs.getString(1));
		}
	}
}