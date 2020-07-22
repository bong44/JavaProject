package lecture17.first;

import java.util.Optional;

import javafx.application.Application; //잘 보고 임포드(2개있음)
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FirstAppMain extends Application{ //추상클래스 상속
	@Override
	public void start(Stage primaryStage) throws Exception { //상위 추상메소드
		
		Label label = new Label();
		label.setText("안뇽, 자바?");  //담아줄 객체 생성
		label.setFont(Font.font(50));

		Button button = new Button();
		button.setText("confrim");  	//담아줄 객체 생성
		button.setOnAction(new EventHandler<ActionEvent>() { //익명 인터페이스 생성 방법 중요!
			
			@Override
			public void handle(ActionEvent event) {
				Optional<ButtonType>wait = new Alert(AlertType.INFORMATION, 
						"프로그램 종료", ButtonType.CLOSE).showAndWait();
				if (wait.get() == ButtonType.CLOSE) {
					Platform.exit();
				}
			}
		});
		
		VBox vBox = new VBox();				//객체들을 담아줄 공간개념의 객체?
		vBox.setAlignment(Pos.CENTER);
		vBox.setSpacing(40);
		vBox.getChildren().add(label);
		vBox.getChildren().add(button);
		vBox.setPadding(new Insets(20)); //들어가있는 라벨들 집합 주변으로 간격을 20씩 줌

		Scene scene = new Scene(vBox);    //화면객체에 Vbox의 내용을 담아 생성
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);//AppMain 객체 생성 및 메인 윈도우 생성
		
	}
}
