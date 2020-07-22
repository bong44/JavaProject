package lecture17.logincss;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Logins.fxml"));
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm()); //css와 연결해주는 구문
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("로그인css");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
