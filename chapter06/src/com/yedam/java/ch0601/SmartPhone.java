package com.yedam.java.ch0601;

public class SmartPhone {

	// field
	// 해당클래스의 속성(정보) 저장하는 구간
	String name;
	String maker;
	int price;
	
	// Constructor
		// 매개변수가 필요한 생성자를 만들게되면, 기본생성자도 직접 만들어주어야한다. 아닐시 오류
		// 어떤 생성자도 안만들어 놓으면 완전기본 쌩 생성자 하나는 자동으로 만들어진다
	public SmartPhone(String name) { 
		this.name = name;
	}
	
	public SmartPhone() {
		
	}
	// Method
	void call() {
		System.out.println(name + " 전화를 겁니다.");
	}
	
	void hangUp() {
		System.out.println(name + " 전화를 끊습니다.");
	}
}
