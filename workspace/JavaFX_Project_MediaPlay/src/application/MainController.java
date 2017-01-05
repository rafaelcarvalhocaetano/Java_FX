package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController implements Initializable{

	@FXML
	private MediaView media;
	MediaPlayer mp;
	Media me;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		String path = new File("src/media/gato.mp4").getAbsolutePath();
		me = new Media(new File(path).toURI().toString());
		mp = new MediaPlayer(me);
		media.setMediaPlayer(mp);
		
		//auto player
		
		mp.setAutoPlay(true);
		DoubleProperty width = media.fitWidthProperty();
		DoubleProperty height = media.fitHeightProperty();
		width.bind(Bindings.selectDouble(media.sceneProperty(), "width"));
		height.bind(Bindings.selectDouble(media.sceneProperty(), "height"));
		
		
	}
	
	

}
