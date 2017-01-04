package application;

import java.sql.*;


public class LoginModel {
	
	Connection conectar;
	
	public LoginModel(){
		
		conectar = SQLiteConnection.conectar();
		
		if(conectar == null) System.exit(1);
		
	}
	public boolean isDbConnected(){
		
		try {
			return !conectar.isClosed();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}