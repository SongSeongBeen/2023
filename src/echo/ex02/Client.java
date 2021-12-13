package echo.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

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
		InputStreamReader isr =  new InputStreamReader(is, "UTF-8"); // 캐스팅하지않아도 문자로 받을 수 있다 (보낼때 번역 언어지정)
		BufferedReader br = new BufferedReader(isr);//선언 
		
		//Scanner(키보드 입력용)
		Scanner sc = new Scanner(System.in);
		
		//반복구간 설정
		while(true) {
			String str = sc.nextLine();
			
			if("/q".equals(str)) { // str.equals("/q") 주가 없을 가능성이 있어 null piont ("/q".equals(str))
				System.out.println("종료키 입력");
				break;
			}
		
		//1.보낼 메세지 내용
		bw.write(str);
		bw.newLine();//줄바꿈으로 끝났다.
		bw.flush();//남아있는 데이터를 모두 출력시킴 
	
		//2.메세지 받기
		String reMag = br.readLine();
		System.out.println("server:["+reMag+"}");
		}
		
		System.out.println("================================");
		System.out.println("<클라이언트 종료 되었습니다>");
		sc.close();
		bw.close();
		socket.close();
	}
	
}
