package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;

public class MainController implements Initializable{

	@FXML
	private long num1;
	@FXML
	private TextField num2;
	@FXML
	private Button btn;
	@FXML
	private Label lbl;
	private Soma soma = new Soma();
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
				
	}
	@FXML
	public void Somar(ActionEvent evento){
		
		lbl.setText(lbl.getText());
		
		
		
	}

}
