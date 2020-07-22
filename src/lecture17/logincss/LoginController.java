package lecture17.logincss;

import javafx.fxml.FXML;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import lecture17.stackpane.LoginListener;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	@FXML AnchorPane loginPane;
	@FXML PasswordField passField;
	@FXML TextField idFeild;
	private LoginListener listener; 
	
	public LoginController() {
	}
	
	public LoginController(LoginListener listener) {
		this.listener = listener;
	}

	@FXML public void cancelAction(ActionEvent event) {
		dismissScene();
	}

	private void dismissScene() {
		StackPane pane = (StackPane)loginPane.getParent(); //자기보다 하위여서 캐스팅 //alt + shift + M 으로 익스트렉메소드(리팩토링 함)
//		로그인화면 초기값
		loginPane.setTranslateY(0);
		Timeline timeline = new Timeline();
		KeyValue keyValue = new KeyValue(loginPane.translateYProperty(), loginPane.getPrefHeight());
		KeyFrame keyFrame = new KeyFrame(Duration.millis(500), new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// 애니메이션이 종료된 후 실행
				pane.getChildren().remove(loginPane);
			}
		},keyValue);
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
	}

	@FXML public void loginAction(ActionEvent event) {
		listener.login(idFeild.getText(), passField.getText());
		dismissScene();
	}



}
