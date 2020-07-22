package lecture18.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetSocketAddress;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); //127.0.0.1
			
			while (true) { //서버가 클라이언트 요청을 받아줬는지 확인
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();
				InetSocketAddress address = (InetSocketAddress) socket.getRemoteSocketAddress();
				String hostName = address.getHostName();
				System.out.println("[연결 수락함]" + hostName);
				// 데이터 받기
				InputStream inputStream = socket.getInputStream();
				byte[] b = new byte[1024];
				int readCount = inputStream.read(b); //b에 읽은 정보 들어가있음
				String message = new String(b,0,readCount, "UTF-8");
				System.out.println("["+hostName+"] : "+message);
				//데이터 보내기
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write(message.getBytes());
				outputStream.flush(); //버퍼비우기
				
				inputStream.close();
				outputStream.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace(); //alt + shift + z 트라이캐치,if 등 드래그로 묶을 수 있는 단축키
		}
		
		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
