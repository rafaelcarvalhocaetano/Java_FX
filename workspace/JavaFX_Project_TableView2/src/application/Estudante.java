package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Estudante {
	
	private final SimpleIntegerProperty id;
	private final SimpleStringProperty nome;
	private final SimpleStringProperty sobreNome;
	private final SimpleIntegerProperty idade;
	
	public Estudante(Integer id, String nome, String sobreNome, Integer idade) {
		super();
		this.id = new SimpleIntegerProperty(id);
		this.nome = new SimpleStringProperty(nome);
		this.sobreNome = new SimpleStringProperty(sobreNome);
		this.idade = new SimpleIntegerProperty(idade);
	}

	public Integer getId() {
		return id.get();
	}

	public String getNome() {
		return nome.get();
	}

	public String getSobreNome() {
		return sobreNome.get();
	}

	public Integer getIdade() {
		return idade.get();
	}
	
	

}
