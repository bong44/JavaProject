package lecture17.powerbutton;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PowerButtonController implements Initializable{

	@FXML ImageView image;
	private BooleanProperty booleanProperty = new SimpleBooleanProperty();
	private List<Image> imageList;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		imageList = new ArrayList<Image>();
		imageList.add(new Image(getClass().getResource("power_off.png").toExternalForm())); //getClass 를 쓰는 이유는 상대경로쓰기위해? 절대경로로 쓰려면? toExternalFrom 써야댐?
		imageList.add(new Image(getClass().getResource("power_on.png").toExternalForm()));
		
		booleanProperty.addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (observable.getValue()) {
					image.setImage(imageList.get(1));
					return;
				}
				image.setImage(imageList.get(0));
			}
		});
	}
	@FXML public void powerClicked(MouseEvent event) {
		booleanProperty.setValue(!booleanProperty.getValue());
	}
}
