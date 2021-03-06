package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable{
	
	@FXML private WebView wv;
	@FXML private WebEngine we;
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		we = wv.getEngine();
				
	}
	
	public void btn1(ActionEvent event) {
		we.load("https://www.google.com");
	}
	public void btn2(ActionEvent event) {
		we.executeScript("windows.location = \"http://easyonlineconverter.com//\";");
	}
	public void btn3(ActionEvent event) {
		we.loadContent("<html><head></head><body><h1>HELLO WORLD</h1></body></html>");
	}
	public void btn4(ActionEvent event) {
		we.reload();

	}
	

}
