package lecture17.rockscissorspaper;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameExampleMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("GameExamples.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("가위바위보");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
