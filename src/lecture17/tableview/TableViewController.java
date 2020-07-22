package lecture17.tableview;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TableViewController implements Initializable{

	@FXML TextField nameField;
	@FXML TextField mobileNumberField;
	@FXML Button addButton;
	@FXML TableColumn<MemberModel, String> nameColumn;
	@FXML TableColumn<MemberModel, String> mobileNumberColumn; //MemberModel 객체 중에서 타입이 String인
	@FXML TableView<MemberModel> membersTableView; //따로 observable 대용 객체 클래스 넣어주면댐
	private ObservableList<MemberModel> memberList;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		memberList = FXCollections.observableArrayList();
		membersTableView.setItems(memberList);
		//cell에 있는 value값을 만들어주는애들 이게 있어야 테이블뷰를 보여줌
		nameColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<MemberModel,String>, ObservableValue<String>>() {
			@Override
			public ObservableValue<String> call(CellDataFeatures<MemberModel, String> param) { //param이 cell들의 객체가 param형태로 들어오는 거임
				return param.getValue().nameProperty();
			}
		}); 
		mobileNumberColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<MemberModel,String>, ObservableValue<String>>() {
			@Override
			public ObservableValue<String> call(CellDataFeatures<MemberModel, String> param) {
				return param.getValue().mobileNumberProperty();
			}
		});
//		//textfield에 데이터가 입력되어 있을 경우 등록버튼 활성화
//		nameField.lengthProperty().addListener(new ChangeListener<Number>() {
//			@Override
//			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//				if (observable.getValue().intValue() > 0) {
//					addButton.setDisable(false);
//				}else {
//					addButton.setDisable(true);
//				}
//			}
//		});
//		mobileNumberField.lengthProperty().addListener(new ChangeListener<Number>() {
//			@Override
//			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//				if (observable.getValue().intValue() > 0) {
//					addButton.setDisable(false);
//				}else {
//					addButton.setDisable(true);
//				}
//			}
//		});
		//bind안에 조건식을 넣어줄 수 있음
		addButton.disableProperty().bind(Bindings.createBooleanBinding(new Callable<Boolean>() {
			
			@Override
			public Boolean call() throws Exception {
				// TODO Auto-generated method stub
				return nameField.lengthProperty().get() == 0 || mobileNumberField.lengthProperty().get() == 0;
			}
		}, nameField.lengthProperty(), mobileNumberField.lengthProperty())); 
	}
	
	@FXML public void addAction() {
		String name =  nameField.getText();
		String mobileNumber = mobileNumberField.getText();
		memberList.add(new MemberModel(name, mobileNumber)); //값을 넣어주는
		nameField.setText("");
		mobileNumberField.setText("");
		nameField.requestFocus();
	}

	@FXML public void deleteAction() {
		int selectedIndex = membersTableView.getSelectionModel().getSelectedIndex();
		if (selectedIndex < 0) { //리스트뷰에 선택된 인덱스가 없으면 -1임
			new Alert(AlertType.WARNING,"선택한 항목이 없습니다.",ButtonType.OK).show();
		}else {
			Optional<ButtonType> wait = new Alert(AlertType.CONFIRMATION,"선택한 항목을 삭제하시겠습니까?",ButtonType.NO,ButtonType.YES).showAndWait();
			if (wait.get() == ButtonType.YES) {
				memberList.remove(selectedIndex);
			}
		}
	}



}
