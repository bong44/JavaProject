package lecture17.scene;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// fxml 파일을 불러와야한다. (같은 패키지에 있을 경우에만 가능)
		//getClass().getResource("Scene.fxml");
		Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml")); //경로의 클래스를 로드해옴
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("처음 JavaFX 파일");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
