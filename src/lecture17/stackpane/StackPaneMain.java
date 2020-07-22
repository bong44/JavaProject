package lecture17.stackpane;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StackPaneMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("StackPanes.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("화면전환");
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
