package echo.ex04;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
	
		Thread thread1 = new DigitThread();//스레드 생성
		Thread thread2 = new LowerThread();//스레드 생성
		Thread thread3 = new UpperThread();//스레드 생성
		
		//스레드(한번에 시작) start에 run(순차적으로 시작) 기능 까지 포함
		thread1.start(); 
		thread2.start(); 
		thread3.start(); 

	}

}
