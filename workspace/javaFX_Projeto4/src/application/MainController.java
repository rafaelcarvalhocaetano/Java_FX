package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class MainController {
	
	@FXML
	private Label myMessage;
	public void generateRandom(ActionEvent event){
		
		
		Random rand = new Random();
		int myrand = rand.nextInt(50) + 1;
		System.out.println(Integer.toString(myrand));
		
		
	}

}
