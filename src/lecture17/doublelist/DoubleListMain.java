package lecture17.doublelist;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DoubleListMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("DoubleLists.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("더블 뷰");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
