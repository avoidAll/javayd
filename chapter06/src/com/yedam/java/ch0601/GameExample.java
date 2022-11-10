package com.yedam.java.ch0601;

public class GameExample {

	public static void main(String[] args) {
		// 기본생성자만 사용해본 case
		Game user1 = new Game();
		// 
		user1.id="예담이";
		user1.passWd = "1234";
		
		// 매개변수가 하나인 생성자를 사용
		Game user2 = new Game("예담이2");
		user2.passWd = "4321";
		
		// 객체를 만들자 마자 값을 넣어주는 case
		Game user3 = new Game("예담이3","4567");
		
		user1.getInfo();
		user2.getInfo();
		user3.getInfo();

		/// static(정적, 고정) field 사용
		System.out.println("\t====\tstatic 필드 호출\t====");
		System.out.println(Game.gameName);
		
	}
	
}
