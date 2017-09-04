import java.sql.*;
import java.util.*;

public class MyFirstDatabaseConnection {
	
	public static void main(String[] args) throws SQLException {
		//getAnimal();
		getSpecies();
	}
	
	public static void getAnimal()  throws SQLException {
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
			/*
			int result = stmt.executeUpdate("delete from species where id = 10");
			
			boolean isResultSet = stmt.execute(sql);
			if (isResultSet) {
				ResultSet rs = stmt.getResultSet();
				System.out.println("ran a query");
			} else {
				int result = stmt.getUpdateCount();
				System.out.println("ran an update");
			}
			
			PreparedStatement ps = conn.prepareStatement("delete from animal where name = ?");
			ps.setString(1, name);
			ps.execute();
			*/
			
			ResultSet rs = stmt.executeQuery("select name from animal")) {
			
			while (rs.next())
				System.out.println(rs.getString(1)); 
			
		}
	}
	
	public static void getSpecies()  throws SQLException {
		String url = "jdbc:derby:zoo";
		try (Connection conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select id, name from species")) {
			
			Map<Integer, String> idToNameMap = new HashMap<>();
			while(rs.next()) {
				int id = rs.getInt("id"); //rs.getInt (1);
				String name = rs.getString("name"); //rs.getString (2);
				idToNameMap.put(id, name);
			}
			System.out.println(idToNameMap); // {1=African Elephant, 2=Zebra}
			
		}
		
	}
	
}