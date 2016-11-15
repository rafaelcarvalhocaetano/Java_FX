package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Painel extends Application{

	
	public static void main(String[]args){
		
		launch(args);
	}
	
	public void start(Stage primaryStage){
		
		primaryStage.setTitle("Painel Teste");
		Button btn = new Button();
		btn.setText("Clique-me");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Voc� me clicou!!!");
				
			}
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 500, 500));
		primaryStage.show();
		
	}
}
