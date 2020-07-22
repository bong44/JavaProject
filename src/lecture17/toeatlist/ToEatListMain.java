package lecture17.toeatlist;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ToEatListMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("ToEatLists.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("음식 뷰");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
