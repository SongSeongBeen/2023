package echo.ex05;

public class DigitRunableImpl implements Runnable {
	
	@Override
	public void run() {// void 리던 불필요
		// 상황에 따라 일처리 하는 속도가 다르다
		for (int cnt = 0; cnt <= 10; cnt++) {
			System.out.println(cnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
