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
	
	
	ObservableList<String> lista = FXCollections.observableArrayList();
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//combobox.setItems(lista);
		
	}
	public void comboChanged(ActionEvent event){
		combobox.getItems().addAll();
		minhaLabel.setText(combobox.getValue());
		
	}
	public void buttonAction(ActionEvent event){
		combobox.getItems().addAll();
		//minhaLabel.setText(combobox.getValue());
		
	}

}
