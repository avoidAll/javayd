package com.yedam.java.ch0702;

public class Application4 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		
		A a1 = b; // 자동 타입변환 되는 상태인 것
		A a2 = c;
	}
}
