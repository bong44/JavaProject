package lecture17.toeatlist;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import com.sun.deploy.uitoolkit.impl.fx.ui.FXConsole;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ToEatListController implements Initializable{

	@FXML Button delete;
	@FXML Button insert;
	@FXML Button search;
	@FXML ListView<String> listView;
	private ObservableList<String> list;
	@FXML TextField searchBox;
	@FXML TextField inputBox;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list = FXCollections.observableArrayList();
		FilteredList<String> filteredList = new FilteredList<String>(list);
		listView.setItems(filteredList);
		
		
		searchBox.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				filteredList.setPredicate(new Predicate<String>() {
					@Override
					public boolean test(String t) {
						return t.contains(searchBox.getText());
					}
				});
			}
		});
		
		inputBox.lengthProperty().addListener(new ChangeListener<Number>() {
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

	@FXML public void searchAction() {
		
	}

	@FXML public void insertAction() {
		list.add(inputBox.getText());
		inputBox.setText("");
		inputBox.requestFocus();
	}

	@FXML public void deleteAction() {
		int selectedIndex = listView.getSelectionModel().getSelectedIndex();
		if (selectedIndex < 0) { //리스트뷰에 선택된 인덱스가 없으면 -1임
			new Alert(AlertType.WARNING,"선택한 항목이 없습니다.",ButtonType.OK).show();
		}else {
			Optional<ButtonType> wait = new Alert(AlertType.CONFIRMATION,"선택한 항목을 삭제하시겠습니까?",ButtonType.NO,ButtonType.YES).showAndWait();
			if (wait.get() == ButtonType.YES) {
				list.remove(selectedIndex);
			}
		}
	}

	@FXML public void keyPressed(KeyEvent event) {
		System.out.println(event.getCode());
		if (event.getCode()==KeyCode.ENTER) {
			insertAction();
		}
	}
	@FXML public void keyPressed2(KeyEvent event) {
		System.out.println(event.getCode());
		if (event.getCode()==KeyCode.DELETE) {
			deleteAction();
		}
	}

}
