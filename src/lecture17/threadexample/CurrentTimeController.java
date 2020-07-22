package lecture17.threadexample;

import java.net.URL;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class CurrentTimeController implements Initializable{

	@FXML Label timeLabel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//개발자가 직접만든 스레드(밑에 runnable)에서는 사용자 timeLabel에 직접 접근이 불가능함
//		Runnable runnable = new Runnable() {
//
//			@Override
//			public void run() {
//				while (true) {
//					Platform.runLater(new Runnable() {  //Platform.runLater는 javaFX 메인 스레드에서 UI를 변경 할 수 있게 해주는 역할 (메인 스레드가 new로 생성된 runnable로 넘겨주는 명령)
//						@Override
//						public void run() {
//							timeLabel.setText(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
//						}
//					});
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//						
//					}
//					
//				}
//			}
//		};
//		Thread thread = new Thread(runnable);
//		thread.start();
		
//		JavaFX 애니메이션으로 구현한 코드
		KeyFrame keyFrame = new KeyFrame(Duration.seconds(1), event -> { //time관련된 쓰레드 클래스는 duration으로 시간 텀 정해줄 수 있음
			timeLabel.setText(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
		});
		Timeline timeline = new Timeline(keyFrame);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
	}
}
