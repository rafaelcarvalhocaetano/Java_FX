package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {

	@FXML
	private Label texto;

	@FXML
	private TextField user;

	@FXML
	private PasswordField senha;




	public void logar(ActionEvent event) throws Exception {

		if (user.getText().equals("rafael") && senha.getText().equals("rafael")) {
			texto.setText("LOGADO COM SUCESSO");

			
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene sena = new Scene(root);
			sena.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(sena);
			primaryStage.show();
			
			
			

		} else {
			texto.setText("ERRO DE SENHA OU LOGIN");
		}
	}

}
