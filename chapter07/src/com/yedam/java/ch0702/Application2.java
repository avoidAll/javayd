package com.yedam.java.ch0702;

public class Application2 {
	public static void main(String[] args) {
		
		HankookTire hTire = new HankookTire("right", 10);
		KumhoTire kTire = new KumhoTire("left", 20);
		
		// Tire 객체에, 자식 객체인 hTrie
		// tire -> 한국 타이어를 사용하고 있다.
		Tire tire = hTire;
		// tire 는 Tire에 정의해놓은 모든 것을 쓰긴쓰되
		// hTire에서 재정의한(오버라이딩한) 것을 쓴다
		System.out.println(tire.roll());
		
		tire = kTire;
		// 부모클래스 Tire의 tire에 자식 kTire로 갈아끼웠다
		System.out.println(tire.roll());
		
		tire = hTire;
		System.out.println(tire.roll());
	}
}
