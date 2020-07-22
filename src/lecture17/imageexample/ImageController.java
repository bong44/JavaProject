package lecture17.imageexample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class ImageController implements Initializable{

	@FXML ImageView imageView;
	private List<Image> imageList; //메소드에서 사용하기 위해 전역으로 뺌
	IntegerProperty countProperty = new SimpleIntegerProperty();
	@FXML Button rightButton;
	@FXML Button leftButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		imageList = new ArrayList<Image>(); //밑에 있는 소스들 하나하나 객체에 넣어 관리하기 힘드니 객체들을 담을 수 있는 리스트를 따로 만들어서 관리
		imageList.add(new Image(getClass().getResource("1.jpeg").toExternalForm()));
		imageList.add(new Image(getClass().getResource("2.jpeg").toExternalForm()));
		imageList.add(new Image(getClass().getResource("3.jpeg").toExternalForm()));
		imageList.add(new Image(getClass().getResource("4.jpeg").toExternalForm()));
		
		
		countProperty.addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					leftButton.setDisable(observable.getValue().intValue() == 0);
					rightButton.setDisable(observable.getValue().intValue() == imageList.size()-1);
			}
			
		});
		
	}
	

	@FXML public void backImageAction(ActionEvent event) {
		countProperty.set(countProperty.get() -1);
		imageView.setImage(imageList.get(countProperty.get()));
	}
	@FXML public void changeImageAction(ActionEvent event) {
		countProperty.set(countProperty.get() +1);
		imageView.setImage(imageList.get(countProperty.get()));
	}
	
}
