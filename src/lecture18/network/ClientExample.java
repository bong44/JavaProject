package lecture18.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
import java.util.Stack;

import sun.font.StrikeCache;

public class ClientExample {
	static Socket socket = null;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("192.168.20.2",9999));
			System.out.println("[연결 성공]");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//서버로 데이터 전송하는 쓰레드
		new Thread(() -> {
			try {
				OutputStream outputStream = socket.getOutputStream();
				String message = scanner.next();
				outputStream.write(message.getBytes());
				outputStream.flush();//버퍼를 지워 줌
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}).start();
		//서버로부터 데이터 받는 쓰레드
		new Thread(() -> {
			try {
				InputStream inputStream = socket.getInputStream();
				byte[] bytes = new byte[1024];
				int readCount = inputStream.read(bytes);
				String receiveMessage = new String(bytes, 0 , readCount,"UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}).start();
		scanner.close();
	}
}
