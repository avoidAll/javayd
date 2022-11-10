package com.yedam.java.ch0601;

public class ConstantNo {
	
	// field
	static final double PI = 3.14159265359;
//	static int earthRound = 46250;
	//final로 바꾸게 된다면
	static final int EARTH_ROUND = 46250;
//	static int lightSpeed = 127000;
	static final int LIGHT_SPEED = 127000;
	
	String words = "This is Java";
	char word = 'Y';
	// constructor
	
	// method
	// static 멤버에 사용 범위(scope)
	
	// static 간에 필드 사용
	static void getCircle(int radius) {
		// pi * r* r
//		System.out.println("지름이 "+radius+"인 원의 넓이 : " + (pi*radius*radius));
		// 스태틱 메소드에서, 스태틱 변수 pi를 호출했으니 사용가능한 구문
	}
	
	// 메소드에 static 필드 호출
	public void allData() {
//		double result = pi + earthRound + lightSpeed;
//		System.out.println(result);
		getCircle(1);
	}
	
	// static 메소드에 일반 필드, 메소드 사용
	public static void words() {
//		String getWord = words + String.valueOf(word);
	}
}
