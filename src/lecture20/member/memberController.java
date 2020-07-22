package lecture20.member;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseButton;
import lecture18.editor.InfoModel;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;

public class memberController implements Initializable{
	
	@FXML TableView<InfoModel> infoTableView;
	@FXML TableColumn<InfoModel, Integer> infoNoColumn;
	@FXML TableColumn<InfoModel, String> pcNoColumn;
	@FXML TableColumn<InfoModel, String> nameColumn;
	@FXML TableColumn<InfoModel, String> emailColumn;
	@FXML TableColumn<InfoModel, String> hobbyColumn;
	@FXML TextField pcNoField;
	@FXML TextField nameField;
	@FXML TextField emailField;
	@FXML TextField hobbyField;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		List<InfoModel> list = new InfoDAO().selectList();
		
//		System.out.println(list.get(0));

		
		ObservableList<InfoModel> infoList = FXCollections.observableArrayList(list); // 중요
		infoTableView.setItems(infoList); //fx 테이블뷰에 넣어주기 위해 위처럼 변환 후 저장
		infoNoColumn.setCellValueFactory(param -> param.getValue().infoNoProperty().asObject());  //테이블에 저장해주기 위한 익명인터페이스 구현
		pcNoColumn.setCellValueFactory(param -> param.getValue().pcNoProperty());                 //테이블 뷰의 필수 구성 <<<<암기>>>>!
		nameColumn.setCellValueFactory(param -> param.getValue().nmProperty());
		emailColumn.setCellValueFactory(param -> param.getValue().emailProperty());
		hobbyColumn.setCellValueFactory(param -> param.getValue().hobbyProperty());
		//테이블 수정하기
		infoTableView.setEditable(true); //테이블 수정모드 가능하게 해줌
		hobbyColumn.setCellFactory(TextFieldTableCell.forTableColumn()); // 사용자의 클릭에 반응 하여 수정모드  
		hobbyColumn.setOnEditCommit(event -> { //입력후 엔터 친 이벤트에 대한 저자액ㄱ체
			infoTableView.getSelectionModel().getSelectedItem().setHobby(event.getNewValue());
			new InfoDAO().update(infoTableView.getSelectionModel().getSelectedItem());
		});
		
		//컨텍스트 메뉴(마우스 오른쪽 눌렀을 때 나오는 메뉴)
		ContextMenu contextMenu = new ContextMenu();
		MenuItem menuItem = new MenuItem("선택항목삭제");
		//메뉴를 선택했을 때 실행할 내용 설정
		menuItem.setOnAction(event -> {
			new InfoDAO().delete(infoTableView.getSelectionModel().getSelectedItem().getInfoNo());
			infoList.remove(infoTableView.getSelectionModel().getSelectedItem().getInfoNo());
		});
		//컨텍스트 메뉴에 삭제 메뉴 등록
		contextMenu.getItems().add(menuItem);
		//테이블뷰의 셀을 선택하고 마우스 오른쪽 버튼을 클릭했을 때 메뉴 나타나게 하기
		infoTableView.setOnMouseClicked(event -> {
			if (event.getButton() == MouseButton.SECONDARY) { //PRIMARY 왼쪽, SECONDARY 오른쪽 (마우스)
				contextMenu.show(infoTableView, event.getScreenX(),event.getScreenY());
			}
		});
	}
	
	@FXML public void registerAction(ActionEvent event) {}

}
