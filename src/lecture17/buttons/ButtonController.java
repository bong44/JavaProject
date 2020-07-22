package lecture17.buttons;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class ButtonController implements Initializable{

	@FXML CheckBox maskCheck;
	@FXML CheckBox glassesCheck;
	@FXML ToggleGroup levelGroup;
	@FXML ToggleGroup languageGroup;
	@FXML Label resultLabel;
	private List<CheckBox> checkList;
	
	@FXML public void confirmAction() {
		StringBuilder builder = new StringBuilder();
		//checkBox
		for (int i = 0; i < checkList.size(); i++) {
			if (checkList.get(i).isSelected()) {
				builder.append(checkList.get(i).getUserData().toString()+ ", ");
			}
		}
		//radio
		if (levelGroup.getSelectedToggle() != null) {
			builder.append(((RadioButton)levelGroup.getSelectedToggle()).getText()+ ", ");
		}
		
		if (languageGroup.getSelectedToggle() != null) {
			builder.append(((ToggleButton)languageGroup.getSelectedToggle()).getText()+ ", ");
		}
		
		resultLabel.setText(builder.toString());
		
		
	}
	//fx객체 초기화
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		checkList = Arrays.asList(glassesCheck, maskCheck);
		// 토글버튼의 값이 변경될 때 마다 이벤트 발생(addListener(listener)) <<-- 이벤트랑 연결 시켜주는거
		languageGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override											//선택한 토글 버튼이 observable에 들어옴 // 다음 바로 newValue로 들어감 //이어서 또 누르면 new -> old	                            
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
			if (newValue == null) {   //클릭이 눌린 상태에서 두번째 클릭 때 토글값이 널이되니까
				oldValue.setSelected(true);  //그것을 이용해서 oldValue를 한번 더 불러와 사용.
				}
			}
		});
	}
	
}
