package lecture17.inputexample;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class inputMain extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("inputs.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("입력 연습");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
