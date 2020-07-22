package lecture18.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

public class FileIOController implements Initializable{

	@FXML TextArea textArea;
	private File file;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	@FXML public void openAction(ActionEvent event) throws Exception {
		FileChooser chooser = new FileChooser();
		file = chooser.showOpenDialog(null);
		//바이너리 형태로 스트림 할 때
//		FileInputStream inputStream = new FileInputStream(file);
//		
//		byte[] bs = new byte[2048];
//		String text = "";
//		
//		while (inputStream.read(bs) != -1) {
//			text += (new String(bs));
//		}
//		textArea.setText(text);
//		inputStream.close();
		
		//문자형태로 스트림 할 때
		//byte로 하면 한글이 깨지기에 파일 Reader와 Writer로 하면 한글이 안 깨짐.
		FileReader reader = new FileReader(file);
		char[] chbf = new char[4];
		StringBuffer buffer = new StringBuffer();
		while (reader.read(chbf) != -1) {
			buffer.append(new String(chbf));  //StringBuffer는 스트링 형태의 리스트와 같다
		}
		reader.close();
		textArea.setText(buffer.toString());
	}
	
	@FXML public void newAction(ActionEvent event) {
		
	}

	@FXML public void saveAction(ActionEvent event) throws Exception {
//		FileOutputStream outputStream = new FileOutputStream(file); 
//		
//		outputStream.write(textArea.getText().getBytes());
//		outputStream.close();
		
		FileWriter writer = new FileWriter(file);
		writer.write(textArea.getText()); //Char클래스는 String의 배열형태를 참조?? 해서 toChar와 같은 메소드 없어도 가능
		writer.close();
		
	}

}
