package com.yedam.java.ch0601;

public class Person {
	
	final String nation = "korea";
	// final이 들어가면, 이후 이 클래스로 만드는 인스턴스들은 nation값이 고정됨
	final String ssn; // 주민등록과 같은 개념
	String name;
	
	public Person(String ssn, String name) {
		// 인스턴스를 만들며 최초에 값을 넣어준 ssn은 이후 변경될 수 없게 됨. final이기 때문에.
		// 클래스에서 final 변수에 값을 저장하지않았고, 인스턴스를 생성하며 값을 주려는것. 값을 주고 고정하는것
		this.ssn = ssn;
		this.name = name;
	}
}
