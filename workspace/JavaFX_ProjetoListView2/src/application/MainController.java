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
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable{

	@FXML
	private Label label;
	
	@FXML
	private ComboBox<String> combo;
	
	@FXML
	private ListView<String> listView;
	
	ObservableList<String> lista = FXCollections.observableArrayList("Rafael", "Rose");
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		listView.setItems(lista);
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
	}
	
	public void comboChanged(ActionEvent eventoChanged){
		
		combo.getItems().addAll("Rafael");
		
	}
	public void buttonAction(ActionEvent evetButton){
		
		ObservableList<String> names;
		names = listView.getSelectionModel().getSelectedItems();
		for(String adc : names){
			System.out.println(adc);
		}
		
	}

}
