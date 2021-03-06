package br.com.rcc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Painel2 extends Application{
	
	public static void main(String[]args){
		
		launch(args);
	}
	
	public void start(Stage primaryStage){
		
		Button exit = new Button("Sair");
		exit.setOnAction(e -> {
			System.out.println("Saindo....");
			System.exit(0);
		});
		
		Button btn = new Button("Clique-me");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				System.out.println("Voc� me apertou");

			}
		});
		
		VBox root = new VBox();
		root.getChildren().addAll(btn, exit);
		Scene scene = new Scene(root, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
