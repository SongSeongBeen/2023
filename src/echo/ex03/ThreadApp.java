package echo.ex03;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
	
		Thread thread = new DigitThread();//스레드 생성
		thread.start(); //스레드시작 start에 run 기능 까지 포함
		//상황에 따라 일처리 하는 속도가 다르다
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
	}

}
