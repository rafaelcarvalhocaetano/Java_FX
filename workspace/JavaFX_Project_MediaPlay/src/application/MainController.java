package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController implements Initializable{

	@FXML
	private MediaView media;
	MediaPlayer mp;
	Media me;
	@FXML Slider valueSlider;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		String path = new File("src/media/gato.mp4").getAbsolutePath();
		me = new Media(new File(path).toURI().toString());
		mp = new MediaPlayer(me);
		media.setMediaPlayer(mp);		
		//mp.setAutoPlay(true);
		DoubleProperty width = media.fitWidthProperty();
		DoubleProperty height = media.fitHeightProperty();
		width.bind(Bindings.selectDouble(media.sceneProperty(), "width"));
		height.bind(Bindings.selectDouble(media.sceneProperty(), "height"));
		valueSlider.setValue(mp.getVolume()*100);
		valueSlider.valueProperty().addListener(new InvalidationListener() {
			
			@Override
			public void invalidated(Observable observable) {
				mp.setVolume(valueSlider.getValue() / 100);
				
			}
		});
				
	}
	public void play(ActionEvent event){
		mp.play();
	}
	public void pause(ActionEvent event){
		mp.pause();
	}
	public void fast(ActionEvent event){
		mp.setRate(2);
	}
	public void slow(ActionEvent event){
		mp.setRate(.5);
	}
	public void reloader(ActionEvent event){
		mp.seek(mp.getStartTime());
		mp.play();
	}
	public void start(ActionEvent event){
		mp.seek(mp.getStartTime());
		mp.stop();
	}
	public void last(ActionEvent event){
		mp.seek(mp.getTotalDuration());
		mp.stop();
	}
	

}
