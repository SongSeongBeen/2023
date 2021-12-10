package echo.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException { //예외처리 인풋아웃풋
		//1.메모리 올려라 socket 으로 통일
		ServerSocket serverSocket = new ServerSocket();
		//2.포트생성
		serverSocket.bind(new InetSocketAddress("192.168.0.225", 10001)); //ipv4 주소
		System.out.println("<서버시작>");
		System.out.println("========================");
		System.out.println("[연결을 기다리고 있습니다.]");
		//4. 연결오면 동의하고 다음으로 넘겨줘라
		Socket socket = serverSocket.accept();
		
		System.out.println("[클라이언트가 연결되었습니다.]");
		
		//1.메세지 받기용 스트림
						//socket안에 메소드가 있어 new 해줄 필요 없다. 
		InputStream is = socket.getInputStream(); //클라이언트socket있는거 가져오기 
		InputStreamReader isr = new InputStreamReader(is); 
		BufferedReader br = new BufferedReader(isr);
		
		//2.메세지 보내기용 스트림
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter isw = new OutputStreamWriter(os); //보낼때 번역 언어지정
		BufferedWriter bw = new BufferedWriter(isw);
		
		
		//1.받을 메세지 내용
		String msg = br.readLine();
		System.out.println("받은메세지:" + msg);
		
		//2.메세지 보내기
		bw.write(msg); //받은메세지 그대로;
		bw.newLine();
		bw.flush();
		
		socket.close();
		serverSocket.close();
		
		//cd c:/ -> cd javaStudy -> cd workspace -> cd chapter06 -> cd bin -> java echo.ex01.Client
		//파일들어가서 바로 cmd치면 바로 생성된다.
	}
	
}
