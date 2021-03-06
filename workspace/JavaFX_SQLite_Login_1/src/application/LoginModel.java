package application;

import java.sql.*;


public class LoginModel {
	
	Connection conectar;
	
	public LoginModel(){
		
		conectar = SQLiteConnection.conectar();		
		if(conectar == null){
			
			System.out.println("Conex�o n�o realizada");
			System.exit(1);
		}
		
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
	public boolean isLogin(String user, String pass) throws SQLException{
		
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "select * from employee where sobreNome = ? and senha = ?";
		
		try {
			
			preparedStatement = conectar.prepareStatement(query);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pass);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()){
				return true;
			}else{
				return false;
			}
						
		} catch (Exception e) {
			
			return false;
		}finally{
			preparedStatement.close();
			resultSet.close();
		}
	}
}