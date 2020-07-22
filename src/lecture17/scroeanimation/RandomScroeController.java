package lecture17.scroeanimation;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class RandomScroeController implements Initializable{

	@FXML Label rightScore;
	@FXML Label leftScore;
	private Timeline timeline;
	private int count;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Random random = new Random();
		KeyFrame frame = new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				rightScore.setText(random.nextInt(900)+100+"");
				leftScore.setText(random.nextInt(900)+100+"");
				count++;
				if (count==50) {
					rightScore.setText("25");
					leftScore.setText("85");
					count = 0;   
				}
			}
		});
		timeline = new Timeline(frame);
		timeline.setCycleCount(50);
	}
	
	@FXML public void buttonClick() {
		timeline.play();
	}
}
