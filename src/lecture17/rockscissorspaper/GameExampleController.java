package lecture17.rockscissorspaper;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class GameExampleController implements Initializable{
	@FXML ToggleGroup buttonGroup;
	@FXML ImageView playerView;
	@FXML ImageView aiView;
	private List<Image> aiList;
	private List<Image> playerList;
	private IntegerProperty integerProperty = new SimpleIntegerProperty();
	@FXML Label resultField;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		playerList = new ArrayList<Image>();
		aiList = new ArrayList<Image>();
		
		aiList.add(new Image(getClass().getResource("가위_오른쪽.png").toExternalForm()));
		aiList.add(new Image(getClass().getResource("바위_오른쪽.png").toExternalForm()));
		aiList.add(new Image(getClass().getResource("보_오른쪽.png").toExternalForm()));
		
		
		playerList.add(new Image(getClass().getResource("가위_왼쪽.png").toExternalForm()));
		playerList.add(new Image(getClass().getResource("바위_왼쪽.png").toExternalForm()));
		playerList.add(new Image(getClass().getResource("보_왼쪽.png").toExternalForm()));
		integerProperty.addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				System.out.println(observable.getValue());
				switch (observable.getValue().intValue()) {
				case 0:
					playerView.setImage(playerList.get(0)); //객체의 낭비를 줄여주는 효과
					break;
				case 1:
					playerView.setImage(playerList.get(1));
					break;
				case 2:
					playerView.setImage(playerList.get(2));
					break;
				}
			}
		});
	}
	@FXML public void resultAction() {
		Random random = new Random();
		int player = random.nextInt(3);
		aiView.setImage(aiList.get(player));
		int ai = integerProperty.getValue().intValue();
		
		if (ai == player) {
			resultField.setText("무승부!");
		}else if (ai == 0 && player == 2 ||
				  ai == 1 && player == 0 ||
				  ai == 2 && player == 1
				) {
			resultField.setText("플레이어 승!");
		}else {
			resultField.setText("AI 승!");
		}
	}

	@FXML public void sAction(ActionEvent event) {
		integerProperty.setValue(0);
	}

	@FXML public void rAction(ActionEvent event) {
		integerProperty.setValue(1);
	}

	@FXML public void pAction(ActionEvent event) {
		integerProperty.setValue(2);
	}
}
