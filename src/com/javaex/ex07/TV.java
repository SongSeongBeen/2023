package com.javaex.ex07;

public class TV {

	// 필드
	private boolean power;
	private int channel;
	private int volume;


	// 생성자
	public TV() {

	}
	public TV(boolean power, int channel, int volume) {
		this.power = power;    //전원상태
		this.channel = channel; //채널 정보
		this.volume = volume;   // 볼륨정보
	}
	
	// 메소드g/s 
	public boolean getpower() {
		return power;
	}
	public int getchannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	//강사님꺼------------------------------
	// 메소드 일반
	public void power(boolean on) {
		if(on == true) {
			this.power = true;
		}else {
			this.power = false;
		}
	}
	public void channel(int channel) {
		if (this.power == true) { //전원on
			if(channel>255) {
				this.channel = 255;
			}else if (channel <1) {
				this.channel = 1;
			}
		}else {//전원off
			System.out.println("전원이 꺼져 있습니다.");
		}
	}
	
	public void channel(boolean up) { //채널
		int nextCannel;
		if (up == true) {//업만 만들고 나머지 else로
			nextCannel = this.channel + 1;
		} else {
			nextCannel = this.channel - 1;
		}
		this.channel(nextCannel);
	}
	
	public void volume(int volume) { //볼륨
		if (this.power == true) {
			if (volume > 100) {
				this.volume = 100;
			} else if (volume < 0) {
				this.volume = 0;
			} else {
				this.volume = volume;
			}
		} else {
			System.out.println("전원이 꺼져 볼륨이 변경되지 않습니다.");
		}
	}
	
	public void volume(boolean up) {
		int nextVolume;
		if (up == true) {
			nextVolume = this.volume + 1;
		} else {
			nextVolume = this.volume - 1;
		}

		this.volume(nextVolume);

	}
	
	public void status() {//전원

		String powerOn;

		if (this.power == true) {
			powerOn = "on";
		} else {
			powerOn = "off";
		}

		System.out.println("[Power]:" + powerOn + "\t[Channel]:" + this.channel + "\t[Volume]:" + this.volume);

	}
}
	
	
//  과제---------------------
//	public void PowerOn() {   //전원을 status로 해줬어야
//		power = true;
//		System.out.println(true);
//	}public void PowerOff() {
//		power = false;
//		System.out.println(false);
//	}
//	
//	public void ChannelUp() {
//		if(channel>=1 && channel<255) {
//			channel++;
//			//System.out.println("CH "+channel); 
//		}else {
//			channel = 1;
//			//System.out.println("CH "+channel); 
//		}
//	} 
//	
//	public void ChannelDown() {
//		if(channel>1 && channel<=255) {
//			channel--;
//			//System.out.println("CH "+channel);
//		}else {
//			channel = 255;
//			//System.out.println("CH "+channel);
//		}
//	} 
//
//	public void VolumeUp() {
//		if(volume>=1 && volume<100) {
//			volume++;
//			//System.out.println("Vol "+volume);
//		}else {
//			volume = 35;
//			//System.out.println("Vol "+volume);
//		}
//	
//	}
//	
//	public void VolumeDown() {
//		if(volume>1 && volume<=100) {
//			volume--;
//			//System.out.println("Vol "+volume);
//		}else {
//			volume = 55;
//			//System.out.println("Vol "+volume);
//		}
//	}
//	
////	public void status() {
////		
////	}
//	public void status(boolean action) {//오버로딩
//		if (action == true) {
//			System.out.println("tv가 켜졌습니다."+channel+volume);
//		} else if (action == false) {
//			System.out.println("tv가 꺼졌습니다."+channel+volume);
//		} else {
//			System.out.println("잘못된 입력");
//		}
//	}
//	
////	@Override
////	public String toString() {
////		return "TV [power=" + power + ", channel=" + channel + ", volume=" + volume + "]";
////	}

	
	



