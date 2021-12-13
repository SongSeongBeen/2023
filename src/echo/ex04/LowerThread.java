package echo.ex04;

public class LowerThread extends Thread{//독립적 실행(출장 보내겠다.)
	//보내기 까지는 가능하나 가서 무엇을 해야 하는거 까지는 설정 불가능
	//필드
	//생성자-디폴트생성자
	//메소드gs
	//메소드일반
	@Override
	public void run() {//void 리던 불필요
		//상황에 따라 일처리 하는 속도가 다르다
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
