package com.yedam.java.ch0702;

public class Tire {
	
	// field
	public int maxRotation; // 최대 회전 수 ==수명
	public int accRotation; // 누적 회전 수
	public String location; // 타이어의 위치

	// constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//method
	public boolean roll() {
		++accRotation;
		// 누적 회전 수 < 최대 회전 수
		if(accRotation < maxRotation) {
			System.out.println(location + " Tire 수명 " + (maxRotation - accRotation) + " 회");
			return true;
		} else {
			System.out.println(" ### " + location + "Tire 펑크 ###");
			return false;
		}
	}
}
