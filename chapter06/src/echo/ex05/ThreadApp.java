package echo.ex05;

public class ThreadApp {
	
	public static void main(String[] args) {
		
		Runnable digit = new DigitRunableImpl();
		Thread thread1 = new Thread(digit);
		
		thread1.start();
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
