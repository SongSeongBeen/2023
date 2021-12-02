package com.javaex.ex03;

public class SoundApp {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Sparrow());
		printSound(new Duck());
	}

	public static void printSound(Soundable soundable) {
		// 출력조건
				System.out.println(soundable.sound());
				
		// 배열
//    	Soundable[] sArray = new Soundable[4];
//    	//값
//    	Soundable c01 = new Cat();
//    	Soundable d01 = new Dog();
//    	Soundable du01 = new Duck();
//    	Soundable s01 = new Sparrow();
//    	//주소
//    	sArray[0] = c01;
//    	sArray[1] = d01;
//    	sArray[2] = du01;
//    	sArray[3] = s01;
		
	}
	
}



