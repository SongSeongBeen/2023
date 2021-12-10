package echo.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException { //예외처리 인풋아웃풋
		//1.메모리 올려라
		ServerSocket serverSocket = new ServerSocket();
		//2.포트생성
		serverSocket.bind(new InetSocketAddress("192.168.0.225", 10001)); //ipv4 주소
		System.out.println("<서버시작>");
		System.out.println("========================");
		System.out.println("[연결을 기다리고 있습니다.]");
		//4. 연결오면 동의하고 다음으로 넘겨줘라
		Socket socket = serverSocket.accept();
		
		System.out.println("[클라이언트가 연결되었습니다.]");
		socket.close();
		serverSocket.close();
		
		//cd c:/ -> cd javaStudy -> cd workspace -> cd chapter06 -> cd bin -> java echo.ex01.Client
		//파일들어가서 바로 cmd치면 바로 생성된다.
	}
	
}
