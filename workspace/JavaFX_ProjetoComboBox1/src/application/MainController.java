package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainController implements Initializable{
	
	@FXML
	public Label minhaLabel;

	@FXML
	public ComboBox<String> combobox;
	
	
	ObservableList<String> lista = FXCollections.observableArrayList("Rafael", "Rose", "Vitor", "Heitor");
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		combobox.setItems(lista);
		
	}
	public void ComboChanged(ActionEvent event){
		minhaLabel.setText(combobox.getValue());
		
	}

}