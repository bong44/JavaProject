package lecture17.listview;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import javafx.fxml.Initializable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public class ListViewController implements Initializable {
	@FXML ListView<String> itemListView;
	@FXML TextField inputField;
	@FXML Button insert;
	@FXML Button delete;
	private ObservableList<String> list;
	@FXML TextField searchField;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list = FXCollections.observableArrayList();
		
		FilteredList<String> filteredList = new FilteredList<String>(list);
		itemListView.setItems(filteredList);
		
		searchField.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				filteredList.setPredicate(new Predicate<String>() {
					@Override
					public boolean test(String t) {
						return t.contains(searchField.getText());
					}
				});
			}
		});
		
		
		//글자가 입력되어 있지 않으면 비활성화
		inputField.lengthProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				if (observable.getValue().intValue() > 0) {
					insert.setDisable(false);
				} else {
					insert.setDisable(true);
				}
			}
		});
//		//입력 창 엔터 적용하기
//		inputField.setOnKeyPressed(new EventHandler<KeyEvent>() {
//			@Override
//			public void handle(KeyEvent event) { //글자를 입력 할 때 마다 이 메소드가 호출댐
//				
//			}
//		});       //씬빌더에서 온키 프레스드 이벤트를 해줄 수 있음
	}
	@FXML
	public void insertAction() {
		list.add(inputField.getText());
		inputField.setText("");//필드초기화
		inputField.requestFocus();//다시 필드에 포커스
	}
	@FXML
	public void deleteAction() {
		int selectedIndex = itemListView.getSelectionModel().getSelectedIndex();
		if (selectedIndex < 0) { //리스트뷰에 선택된 인덱스가 없으면 -1임
			new Alert(AlertType.WARNING,"선택된 값이 없습니다",ButtonType.OK).show();
		}else {
			list.remove(selectedIndex);
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
