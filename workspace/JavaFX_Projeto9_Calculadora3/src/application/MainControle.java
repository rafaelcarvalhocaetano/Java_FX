package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainControle {
	
	@FXML
	private Label resultado;
	private boolean start = true;
	private String operador = "";
	private long number1 = 0;
	private Controle controle = new Controle();
	
	@FXML
	public void operNumber(ActionEvent event){
		
		if(start){
			resultado.setText("");
			start = false;
		}
		String value = ((Button) event.getSource()).getText();
		resultado.setText(resultado.getText()+value);
	}
	
	@FXML
	public void operOperator(ActionEvent eventOper){
		
		String value = ((Button) eventOper.getSource()).getText();
		if(!value.equals("=")){
			if(!operador.isEmpty()){
				return;
			}
			operador = value;
			number1 = Long.parseLong(resultado.getText());
			resultado.setText("");
			
		}else{
			if(operador.isEmpty()){
				return;
			}
			long number2 = Long.parseLong(resultado.getText());
			float output = controle.calculadora(number1, number2, operador);
			resultado.setText(String.valueOf(output));
			operador = "";
			start = true;
		}
	}
}
