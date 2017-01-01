package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class MainController {
	
	@FXML LineChart<String, Number> idLC;
	
	public void btn(ActionEvent evento){
		
		idLC.getData().clear();
		
		XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
		
		series.getData().add(new XYChart.Data<String, Number>("Jan", 200));
		series.getData().add(new XYChart.Data<String, Number>("Fev", 100));
		series.getData().add(new XYChart.Data<String, Number>("Mar�o", 500));
		series.getData().add(new XYChart.Data<String, Number>("Abril", 50));
		series.setName("Line CHART");
		idLC.getData().add(series);
	}

}
