package com.yedam.java.ch0601;

public class Car {
	// Field(필드,속성)
	int maxSpeed = 100;
	String color = "red";
	
	// Constructor(생성자)
	// 원래는 생략해도 상관이 없다???
	public Car() { // 생성자는 클래스와 이름이 같다
		// return 값이 없고, 비어있음, 본인의 이름이 없는격
		System.out.println("(생성자가 작동하면.)");
		System.out.println("자동차가 출하되었습ㄴ디ㅏ");
	}
	
	// Method(메소드,동작)
	public void run() { // 메
		System.out.println("자동차가 동작 중입니다.");
	}
	
	//실행클래스와 라이브러리클래스는 main이 없음
}
