package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
public class MainController{
	
	@FXML
	private Label lb;
	@FXML
	private TextField tx;
	
	
	@FXML
	public void generateRandom(ActionEvent event){
	
		//Random rand = new Random();
		//int myrand = rand.nextInt(50) + 1;
		lb.setText(tx.getText());  //mensagem que ser� apresentada no label no app
		//System.out.println(Integer.toString(myrand));
	
	}
	
	

}
