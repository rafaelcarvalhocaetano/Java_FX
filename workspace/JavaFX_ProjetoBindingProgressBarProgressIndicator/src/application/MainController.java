package application;


import java.net.URL;
import java.util.ResourceBundle;

import javax.xml.stream.events.ProcessingInstruction;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class MainController implements Initializable {

	final MeuNome nome = new MeuNome();

	@FXML
	private Label label;

	@FXML
	private ProgressBar bar;

	@FXML
	private ProcessingInstruction indico;
	// ---

public void initialize(URL location, ResourceBundle resources) {
		
		nome.setNumber(0);
		nome.numberProperty().addListener(new ChangeListener<Object>() {
			bar.progressProperty().bind(nome.numberProperty());
			indico.progressProperty().bind(nome.numberProperty());

			@Override
			public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue){
				
				label.setText(new Double(nome.getNumber()).toString());
				
			}
		});
	}

		public void btnClick(ActionEvent event) {

		nome.setNumber(nome.getNumber() + 1);
	}

	public void btn2Click(ActionEvent event) {

		nome.setNumber(nome.getNumber() + 1);
	}
}
