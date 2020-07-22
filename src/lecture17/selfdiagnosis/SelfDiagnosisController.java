package lecture17.selfdiagnosis;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Stack;
import java.util.function.Consumer;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;

public class SelfDiagnosisController implements Initializable{

	@FXML Button commit;
	@FXML ToggleGroup one;
	@FXML ToggleGroup two;
	@FXML ToggleGroup thr;
	@FXML ToggleGroup fou;
	@FXML ToggleGroup fif;
	@FXML ToggleGroup six;
	@FXML TextField check12of1;
	@FXML CheckBox check12;
	@FXML CheckBox check11;
	@FXML CheckBox check10;
	@FXML CheckBox check9;
	@FXML CheckBox check8;
	@FXML CheckBox check7;
	@FXML CheckBox check6;
	@FXML CheckBox check5;
	@FXML CheckBox check4;
	@FXML CheckBox check3;
	@FXML CheckBox check2;
	@FXML CheckBox check1;
	@FXML ToggleButton sixTog;
	@FXML ToggleButton sixTog1;
	@FXML ToggleButton fifTog;
	@FXML ToggleButton fifTog1;
	@FXML ToggleButton fouTog;
	@FXML ToggleButton fouTog1;
	@FXML ToggleButton thrTog;
	@FXML ToggleButton thrTog1;
	@FXML ToggleButton twoTog;
	@FXML ToggleButton twoTog1;
	@FXML ToggleButton oneTog;
	@FXML ToggleButton oneTog1;
	private List<CheckBox> checkList;
	private int count = 0;
	private int yn = 0;
	private String[] arr = new String[12];
	@FXML AnchorPane visiable;
	@FXML Label dateReal;
	
	
	public void visibleMethod() {
		sixTog.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				visiable.setVisible(observable.getValue());
			}
		});
//		List<ToggleGroup> ansList = Arrays.asList(one,two,thr,fou,fif,six);
//		ansList.forEach(new Consumer<ToggleGroup>() {
//
//			@Override
//			public void accept(ToggleGroup t) {
//				
//			}
//		});
	}
	
	
	public void visibleMethod2() {   
		check12of1.lengthProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					
				check12.setSelected(observable.getValue().intValue() > 0);
				
			}
		});
	}
	
	
	@FXML public void confirmAction() {
		
		if (one.getSelectedToggle() != null) {
			System.out.print("1번 :"+1+" ");
		}else {
			System.out.print("1번 :"+"0 ");
		}
		
		if (two.getSelectedToggle() != null) {
			System.out.print("2번 :"+1+" ");
		}else {
			System.out.print("2번 :"+"0 ");
		}
		
		if (thr.getSelectedToggle() != null) {
			System.out.print("3번 :"+1+" ");
		}else {
			System.out.print("3번 :"+"0 ");
		}
		
		if (fou.getSelectedToggle() != null) {
			System.out.print("4번 :"+1+" ");
		}else {
			System.out.print("4번 :"+"0 ");
		}
		
		if (fif.getSelectedToggle() != null) {
			System.out.print("5번 :"+1+" ");
		}else {
			System.out.print("5번 :"+"0 ");
		}
		
		if (six.getSelectedToggle() != null) {
			System.out.print("6번 :"+1+" ");
		}else {
			System.out.print("6번 :"+"0 ");
		}
		
		
		StringBuilder builder = new StringBuilder();
		//checkBox
		for (int i = 0; i < checkList.size(); i++) {
			
				if (checkList.get(i).isSelected()) {
					count++;
					if (count == 1) {
						builder.append(checkList.get(i).getUserData().toString());
						arr[i] = checkList.get(i).getUserData().toString();
//						System.out.print(i+"번: "+checkList.get(i).getUserData().toString());
						
					}else {
							builder.append(", "+checkList.get(i).getUserData().toString());
							arr[i] = ", "+checkList.get(i).getUserData().toString();
//							System.out.print(", "+i+"번: "+checkList.get(i).getUserData().toString());
							if (i==11) {
								yn=1;
							}
						}
					}	
				
				}
		
		System.out.print("6_1번: ");
		for (String string : arr) {
			if (string !=null) {
				
				System.out.print(string);
			}
		}
		if (yn==1) {
			System.out.print("(" + check12of1.getText()+")");
		}
			
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//날짜
		dateReal.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일")));
		
		
		
		checkList = Arrays.asList(check1,check2,check3,check4,check5,check6,check7,check8,check9,check10,check11,check12);
	}
}
