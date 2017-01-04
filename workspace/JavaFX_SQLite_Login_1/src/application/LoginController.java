package application;

import java.net.URL;
import java.time.chrono.IsoChronology;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class LoginController implements Initializable{
	
	public LoginModel loginModel = new LoginModel();
	
	@FXML
	private Label isConnected;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		if(loginModel.isDbConnected()){
			
			isConnected.setText("CONECTADO");
			
		}else{
			
			isConnected.setText("N�O CONECTADO");
		}
		
	}

}
