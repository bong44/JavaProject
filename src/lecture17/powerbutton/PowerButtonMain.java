package lecture17.powerbutton;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PowerButtonMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("PowerButtons.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("파워");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
