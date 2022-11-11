package com.yedam.java.ch0703;

public class Dog extends Animal{

	public Dog() {
		this.kind = "포유류";
	}
	
	// 추상클래스 Animal에서 추상 메소드 sound(), 상속받는 클랫는 꼭 작성해야함
	@Override
	public void sound() { 
		System.out.println("멍멍");
	}
	
}
