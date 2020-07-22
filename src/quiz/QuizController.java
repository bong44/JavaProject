package quiz;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;

public class QuizController implements Initializable{
	

	@FXML Label resultLabel;
	@FXML RadioButton easy;
	@FXML ToggleGroup radioGroup;
	@FXML RadioButton deficult;
	@FXML CheckBox listView;
	@FXML CheckBox hBox;
	@FXML CheckBox checkBox;
	@FXML CheckBox comboBox;
	@FXML CheckBox anchorPane;
	private List<CheckBox> checkList;
	private int count = 0;

	@FXML public void confirmAction() {
		
		StringBuilder builder = new StringBuilder();
		
		System.out.println(count);
		
		builder.append("1번 선택한 항목: ");
		for (int i = 0; i < checkList.size(); i++) {
			if (checkList.get(i).isSelected()) {
				count++;
				if (count == 1) {
					builder.append(checkList.get(i).getUserData().toString());
				} else {
					builder.append(", "+checkList.get(i).getUserData().toString());
				}
			}
		}
		builder.append("입니다.");
		builder.append("\n2번: ");
		if (radioGroup.getSelectedToggle() != null) {
			builder.append(((RadioButton)radioGroup.getSelectedToggle()).getText()+ ".");
		}
		
		resultLabel.setText(builder.toString());
		
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		checkList = Arrays.asList(listView, hBox, checkBox, comboBox, anchorPane);
		
	}
}
