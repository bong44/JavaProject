package lecture18.editor;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.scene.control.TextField;

public class EditorController {

	@FXML TextArea textField;
	@FXML TextField pathField;
	private File file;

	@FXML public void openAction(ActionEvent event) throws Exception {
		FileChooser chooser = new FileChooser();
		file = chooser.showOpenDialog(null);
		pathField.setText(file.getPath());
		//파일 입력
		BufferedReader reader = new BufferedReader(new FileReader(file));
		reader.readLine(); //자동으로 스트링으로 변환
		String temp;
		StringBuffer buffer = new StringBuffer();
		while ((temp = reader.readLine()) != null) {
			buffer.append(temp + "\n");
		}
		textField.setText(buffer.toString());
		reader.close();
	}

	@FXML public void saveAction(ActionEvent event) throws Exception {
		FileWriter writer = new FileWriter(file);
		writer.write(textField.getText());
		writer.close();
	}

	@FXML public void saveAsAction(ActionEvent event) throws Exception {
		FileChooser chooser = new FileChooser();
		File file = chooser.showSaveDialog(null);
		
		FileWriter writer = new FileWriter(file);
		
		writer.write(textField.getText());
		writer.close();
		
	}


}
