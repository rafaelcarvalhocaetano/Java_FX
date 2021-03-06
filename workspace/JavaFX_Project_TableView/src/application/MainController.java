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
	
	@FXML private TableView<Estudante> tabela;
	@FXML private TableColumn<Estudante, Integer> id;
	@FXML private TableColumn<Estudante, String> nome;
	@FXML private TableColumn<Estudante, String> sobreNome;
	@FXML private TableColumn<Estudante, Integer> idade;
	
	
	public ObservableList<Estudante> list = FXCollections.observableArrayList(
			new Estudante(1, "Mark 1", "Sobre Nome", 22),
			new Estudante(2, "Mark 2", "Sobre Nome", 22),
			new Estudante(3, "Mark 3", "Sobre Nome", 22),
			new Estudante(4, "Mark 4", "Sobre Nome", 22),
			new Estudante(5, "Mark 5", "Sobre Nome", 22),
			new Estudante(6, "Mark 6", "Sobre Nome", 22),
			new Estudante(7, "Mark 7", "Sobre Nome", 22)
			);
		
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		id.setCellValueFactory(new PropertyValueFactory<Estudante, Integer>("ID"));
		nome.setCellValueFactory(new PropertyValueFactory<>("Nome"));
		sobreNome.setCellValueFactory(new PropertyValueFactory<>("Sobre Nome"));
		idade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		tabela.setItems(list);
		
	}

}
