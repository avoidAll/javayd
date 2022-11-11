package com.yedam.java.ch0701;

public class People extends Student{

	public String name;
	public String ssn;
	
	
	// Constructor
	// 매개변수 없는 생성자를 만들어줘야 다른 클래스가 지금 이 클래스를 상속할 수 있다?
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
