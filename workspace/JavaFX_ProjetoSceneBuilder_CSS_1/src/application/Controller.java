package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Random;


public class Controller {
	
	@FXML
	private Label minhaMSG;
	public void generateRandom(ActionEvent evento){
		
		Random rand = new Random();
		int myRand = rand.nextInt(60)+1;
		minhaMSG.setText(Integer.toString(myRand));
	}

}
