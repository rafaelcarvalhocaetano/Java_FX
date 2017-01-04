package application;
import java.sql.*;

public class SQLiteConnection {
	
	public static Connection conectar(){
		
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:ID.sqlite");
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
			// TODO: handle exception
		}
	}
}
