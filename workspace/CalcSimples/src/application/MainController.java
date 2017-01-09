package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private Label lb;
	@FXML
	private TextField tx;
	@FXML
	private Button btn;
	
	
	@FXML
	public void generateRandom(ActionEvent event){
	
		//Random rand = new Random();
		//int myrand = rand.nextInt(50) + 1;
		lb.setText(tx.getText());  //mensagem que ser� apresentada no label no app
		//System.out.println(Integer.toString(myrand));
		
		
	
	}
	
	public void sair(){
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
				System.out.println("Saindo");
				System.exit(0);
				
			}
			
			
		});
	}

}