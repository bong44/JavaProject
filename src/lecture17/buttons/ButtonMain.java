package lecture17.buttons;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ButtonMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception { //구현 첫번째(경로설정) 다음으로 컨트롤러를 설정해줘야함(editor) 다른클래스에서
		Parent root = FXMLLoader.load(getClass().getResource("Buttons.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("버튼 종류 연습");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
