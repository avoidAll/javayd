package com.yedam.java.ch0703;

// Phone 추상클래스를 상속하는 실체클래스
public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("Serching Internet...");
	}
}
