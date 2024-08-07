package echo.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws IOException {
		//socket으로 통일
		Socket socket = new Socket();
		System.out.println("<클라이언트 시작>");           
		//3. 포트에 연결									 //포트값 자기가 설정
		socket.connect(new InetSocketAddress("192.168.0.8", 10001)); //ipv4 주소 Server 동일주소
		System.out.println("[연결을 기다리고 있습니다.]");
		
		System.out.println("[서버에 연결 되었습니다.]");
		
		
		
		//1.메세지 보내기 스트림
		//socket에게 달라고한다 이미연결해놨기때문에
		OutputStream os = socket.getOutputStream(); // 주소 스트림
		//번역   언어지정까지
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8"); // 번역 언어지정
		BufferedWriter bw = new BufferedWriter(osw);
		
		//2.메세지 받기용 스트림
		InputStream is = socket.getInputStream();
		InputStreamReader isr =  new InputStreamReader(is, "UTF-8"); // 보낼떄 번역 언어지정
		BufferedReader br = new BufferedReader(isr);
		
		//1.보낼 메세지 내용
		String str = "안녕하세요";
		bw.write(str);
		bw.newLine();//줄바꿈으로 끝났다.
		bw.flush();//가득채웠다. 
		
		//2.메세지 받기
		String reMag = br.readLine();
		System.out.println("server:["+reMag+"}");
		
		bw.close();
		socket.close();
	}
	
}
