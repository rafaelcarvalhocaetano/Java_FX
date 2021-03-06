package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable{

	@FXML private TableView<Estudante> tableView;
	@FXML private TableColumn<Estudante, Integer> id;
	@FXML private TableColumn<Estudante, String> nome;
	@FXML private TableColumn<Estudante, String> sobreNome;
	@FXML private TableColumn<Estudante, Integer> idade;

	
	public ObservableList<Estudante> lista = FXCollections.observableArrayList(
			
			new Estudante(1, "Rafael", "Carvalho1", 30),
			new Estudante(1, "Vitor", "Carvalho2", 7),
			new Estudante(1, "Heitor", "Carvalho3", 2),
			new Estudante(1, "Rose", "Carvalho4", 27),
			new Estudante(1, "Rafael1", "Carvalho5", 320),
			new Estudante(1, "Rafael2", "Carvalho6", 330),
			new Estudante(1, "Rafael3", "Carvalho7", 340),
			new Estudante(1, "Rafael4", "Carvalho8", 350)
			);
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		id.setCellValueFactory(new PropertyValueFactory<Estudante, Integer>("id"));
		nome.setCellValueFactory(new PropertyValueFactory<Estudante, String>("nome"));
		sobreNome.setCellValueFactory(new PropertyValueFactory<Estudante, String>("sobreNome"));
		idade.setCellValueFactory(new PropertyValueFactory<Estudante, Integer>("idade"));
		tableView.setItems(lista);
		
	}

}
