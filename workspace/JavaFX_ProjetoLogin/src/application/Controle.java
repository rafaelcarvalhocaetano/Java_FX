package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controle {

	@FXML
	private Label cadastro;

	@FXML
	private TextField userName;

	@FXML
	private PasswordField senha;

	public void login(ActionEvent evento) throws IOException {
		if (userName.getText().equals("rafael") && senha.getText().equals("rafael")) {
			cadastro.setText("Cadastro Realizado com Sucesso");

			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} else {
			cadastro.setText("Login Errado");
		}
	}

}
