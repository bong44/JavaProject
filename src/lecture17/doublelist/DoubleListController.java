package lecture17.doublelist;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class DoubleListController implements Initializable{

	@FXML ListView<String> listViewLeft;
	@FXML ListView<String> listViewRight;
	@FXML TextField textField;
	@FXML Button insert;
	private ObservableList<String> listLeft;
	private ObservableList<String> listRight;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		listLeft = FXCollections.observableArrayList();
		listRight = FXCollections.observableArrayList();
		
		listViewLeft.setItems(listLeft);
		listViewRight.setItems(listRight);
		
		textField.lengthProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				if (observable.getValue().intValue() > 0) {
					insert.setDisable(false);
				} else {
					insert.setDisable(true);
				}
			}
		});
	}

	@FXML public void insertAction(ActionEvent event) {
		listLeft.add(textField.getText()); //데이터는 항상 observable 객체를 사용해서 넣어줘야 함
		textField.setText("");//필드초기화
		textField.requestFocus();//다시 필드에 포커스
		
		
	}

	@FXML public void move(ObservableList<String> original, ObservableList<String> target, String actionName) {
		int index = -1;
		if (actionName.equals("right")) {
			index = listViewLeft.getSelectionModel().getSelectedIndex();
		}else {
			index = listViewRight.getSelectionModel().getSelectedIndex();
		}
		target.add(original.get(index));
		original.remove(index);
	}

	@FXML public void moveRight(ActionEvent event) {
		move(listLeft, listRight, "right");
	}
	@FXML public void moveLeft(ActionEvent event) {
		move(listRight, listLeft, "");
	}

	@FXML public void allMoveRight(ActionEvent event) {
		int index = listViewLeft.getSelectionModel().getSelectedIndex();
		if (index < 0) {
			return ;
		}
		listRight.addAll(listLeft);
		listLeft.clear();
	}

	@FXML public void allMoveLeft(ActionEvent event) {
		int index = listViewRight.getSelectionModel().getSelectedIndex();
		if (index < 0) {
			return ;
		}
		listLeft.addAll(listRight);
		listRight.clear();
	}

}
