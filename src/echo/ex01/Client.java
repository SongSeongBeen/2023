package echo.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket();
		System.out.println("<클라이언트 시작>");           
		//3. 포트에 연결									 //포트값 자기가 설정
		socket.connect(new InetSocketAddress("192.168.0.225", 10001)); //ipv4 주소 Server 동일주소
		System.out.println("[연결을 기다리고 있습니다.]");
		
		System.out.println("[서버에 연결 되었습니다.]");
		socket.close();
	}
	
	

}
