package br.com.rcc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Projeto2 extends Application{
	
	public static void main(String[]args){
		launch(args);
	}
	
	public void start(Stage primaryStage){
		
		primaryStage.setTitle("Projeto 2");
		Button btn = new Button("Clique-me");
		Button exit = new Button("Exit");
		//btn.setText("Clique-me");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Projeto 2");
			}
		});
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root, 600, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}