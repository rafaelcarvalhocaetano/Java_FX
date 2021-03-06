package application;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

		@FXML
		private Label result;
		private long number1 = 0;
		private String operador = "";
		private boolean start = true;
		private Model model = new Model();

		@FXML
		public void processNumber(ActionEvent eventNumber) {
			if (start) {
				result.setText("");
				start = false;
			}
			String value = ((Button) eventNumber.getSource()).getText();
			result.setText(result.getText() + value);
		}

		@FXML
		public void processOperators(ActionEvent eventOperator) {

			String value = ((Button) eventOperator.getSource()).getText();
			if (!value.equals("=")) {
				if (!operador.isEmpty()) {
					return;
				}
				operador = value;
				number1 = Long.parseLong(result.getText());
				result.setText("");
			} else {
				if (operador.isEmpty()) {
					return;
				}
				long number2 = Long.parseLong(result.getText());
				float output = model.calculadora(number1, number2, operador);
				result.setText(String.valueOf(output));
				operador = "";
				start = true;
			}
		}

	}
