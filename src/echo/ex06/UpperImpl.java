package echo.ex06;

public class UpperImpl implements Runnable {//상속
	
	@Override
	public void run() {// void 리던 불필요
		// 상황에 따라 일처리 하는 속도가 다르다
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
