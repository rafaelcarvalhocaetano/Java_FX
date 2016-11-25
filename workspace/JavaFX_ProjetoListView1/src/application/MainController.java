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
import javafx.scene.control.ListView;

public class MainController implements Initializable{
	
	@FXML
	private Label minhaL;
	
	@FXML
	private ComboBox<String> combobox;
	
	@FXML
	private ListView<String> myListView;
	
	ObservableList<String> lista = FXCollections.observableArrayList();
		
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		myListView.setItems(lista);
		
	}
	public void comboChanged(ActionEvent evento){
		combobox.getItems().addAll();
		
	}
	public void buttonAction(ActionEvent eventoButton){
		combobox.getItems().addAll();
		minhaL.setText(combobox.getValue());
	}
	

}
