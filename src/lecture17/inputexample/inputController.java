package lecture17.inputexample;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import sun.net.www.content.text.plain;
import javafx.scene.control.PasswordField;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

public class inputController implements Initializable {

	@FXML TextField txtField;
	@FXML PasswordField txtPassward;
	@FXML DatePicker dateExit;
	@FXML TextArea txtContent;
	@FXML ComboBox<String> comboPublic;
	@FXML Button btnReg;
	@FXML Button btnCancel;
	@FXML Label contentsLabel;
	@FXML CheckBox visiableBox;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//콤보박스
//		ObservableList<String> list = FXCollections.observableArrayList("공개","비공개");
//		list.add("공개");
//		list.add("비공개");
//		comboPublic.setItems(list);
		
		//내용 보여주기 
		visiableBox.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// 채크박스가 변경될 때 마다 얘가 실행됨.
				
					contentsLabel.setVisible(observable.getValue());
					txtContent.setVisible(observable.getValue());
				
			}
		});
		
		txtPassward.lengthProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					
				visiableBox.setSelected(observable.getValue().intValue() > 0);
				
			}
		});
		
	}
	
	public void handleBtnRegAction(ActionEvent e) {
		String title = txtField.getText();
		System.out.println("타이틀: " + title);
		
		String password = txtPassward.getText();
		System.out.println("패스워드: " + password);
	
		LocalDate localDate = dateExit.getValue();
		if (localDate != null) {
			System.out.println("날짜: " + localDate.toString());
		}
		
		String content = txtContent.getText();
		System.out.println("컨탠트: " + content);
	}
	
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
	
	
	
}
