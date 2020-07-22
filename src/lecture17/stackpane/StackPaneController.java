package lecture17.stackpane;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Callback;
import javafx.util.Duration;
import lecture17.logincss.LoginController;

public class StackPaneController implements Initializable{ // 이미 메모리에 올라간 객체끼리의 데이터 전송을 위해 사용할 수 있는 수단: 인터페이스(디자인패턴)
 
	
	@FXML StackPane stackPane;
	@FXML Label resultLabel;

	@Override
		public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML public void loginAction() throws Exception {
//		Parent login = FXMLLoader.load(getClass().getResource("../logincss/Logins.fxml"));
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../logincss/Logins.fxml")); //컨트롤러도 같이 가져오기위해 fxmmloader형으로 생성
		fxmlLoader.setControllerFactory(new Callback<Class<?>, Object>() {
			@Override
			public Object call(Class<?> param) {
				return new LoginController(new LoginListener() { //리플랙션기법?
					
					@Override
					public void login(String id, String password) {
						resultLabel.setText("id: "+id+"password: "+password);
					}
				});
			}
		});
		
		
		Parent login = fxmlLoader.load();
		stackPane.getChildren().add(login);
		
		login.setTranslateX(((AnchorPane)login).getPrefWidth());
		Timeline timeline = new Timeline();
		KeyValue keyValue = new KeyValue(login.translateXProperty(), 0);
		KeyFrame keyFrame = new KeyFrame(Duration.millis(500), keyValue);
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
		
		
	}
	
}
