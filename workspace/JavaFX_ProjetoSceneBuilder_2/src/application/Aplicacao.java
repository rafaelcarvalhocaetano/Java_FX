package application;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Aplicacao extends Application{
	
	public static void main(String[]args){
		launch(args);
	}
	@FXML
	private Label myLabel;
	
	public void start(Stage pramaryStage){
		
		pramaryStage.setTitle("Painel de Teste");
		Button exit = new Button("SAIR");
		exit.setOnAction(e ->{
			System.out.println("Saindo");
			System.exit(0);
		});
		Button btn = new Button("ENTRAR");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Ola Teste");
				
			}
		});
		
		//StackPane root = new StackPane();  -->> Poderia colocar um Stackpane mas n�o funcionar�
		VBox root = new VBox();
		root.getChildren().addAll(btn, exit);
		Scene scene = new Scene(root, 500, 500);
		pramaryStage.setScene(scene);
		pramaryStage.show();
	}

}
