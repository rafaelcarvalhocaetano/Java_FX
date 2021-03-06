package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;

public class MainController {
	
	@FXML LineChart<String, Number> lc;
	@FXML Label lbl;
	
	public void btn(ActionEvent event){
		 lc.getData().clear();
		 
		 XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
		 series.getData().add(new XYChart.Data<String, Number>("Janeiro", 15));
		 series.getData().add(new XYChart.Data<String, Number>("Fevereiro", 30));
		 series.getData().add(new XYChart.Data<String, Number>("Mar�o", 10));
		 series.getData().add(new XYChart.Data<String, Number>("Abril", 60));
		 series.setName("Play 1");
		 
		 lc.getData().addAll(series);
		 
		 for(final XYChart.Data<String, Number> data : series.getData()){
			 
			data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					lbl.setText("X: " + data.getXValue() + "\n Y : " + String.valueOf(data.getXValue()));
					Tooltip.install(data.getNode(), new Tooltip("X: " + data.getXValue() + "\n Y : " + String.valueOf(data.getXValue())));
					
					
				}
			});
		 }
		 
	}
	

}
