package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Button btn;
	@FXML
	private TextField tf1;
	@FXML
	private TextField tf2;
	@FXML
	private Label lb;
	
	
	public void somar(ActionEvent evento){
		
		lb.setText(tf1.getText() + tf2.getText());
	}

}
