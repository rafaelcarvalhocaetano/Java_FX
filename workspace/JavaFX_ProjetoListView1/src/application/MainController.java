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
	private Label minhaL;
	
	@FXML
	private ComboBox<String> combobox;
	
	@FXML
	private ListView<String> myListView;
	
	ObservableList<String> lista = FXCollections.observableArrayList("rafael");
		
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
				
		myListView.setItems(lista);
		myListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
	}
	public void comboChanged(ActionEvent evento){
		combobox.getItems().addAll("rafael");
		
	}
	public void buttonAction(ActionEvent eventoButton){
		//myListView.getItems().addAll("rafael");
		//minhaL.setText(combobox.getValue());
		ObservableList<String> names;
		names = myListView.getSelectionModel().getSelectedItems();
		for(String name : names){
			System.out.println(name);
		}
	}
	

}
