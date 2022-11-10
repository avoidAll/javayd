package com.yedam.java.ch0601;

public class Game {
	// field
	//	객체로 만든다? :: 인스턴스 화 된다
	//	 인스턴스 필드
	//	
	static String gameName = "MineCraft"; // 변경되는 값이 아닐 경우에는
	String server = "korea_server"; // 생성하면서 입력할 값이 아니기에 미리 선언해줌
	String id;
	String passWd;
	
	// constructor
	public Game() {
		
	}
	public Game(String id) {
		this.id = id;
	}
	public Game(String id, String passWd) {
		this.id = id;
		this.passWd = passWd;
	}
	
	
	// method
	// 인스턴스 메소드
	void getInfo() {
		System.out.println("GameName : " + gameName);
		System.out.println("id : "  + id);
		System.out.println("password : " + passWd);
		System.out.println("server : " + server + "\t===================");
		
	}
	
	
	//인스턴스 멤버란? 인스턴스 필드와 인스턴스 메소드
	// :: 인스턴스를 생성한 후 사용할 수 있는 필드와 메소드 ::
	
	// this는 객체 내에서 인스턴스 멤버에 접근하기 위해 사용
	
	
	
	// 정적(static) 멤버
	// instance를 만들지 않고 쓸 수 있는 변수를 선언하는것
	// static은 위험하면서도 편하기도 함.
	
	// 정적변수는 프로그램이 시작되면서부터 끝날때까지
	// 어느필드에서나 써야한다? > 정적필드로 선언
	// 정적 멤버 : 클래스에 고정된 멤버로서 객체 생성하지 않고 사용 할 수 있는 필드와 메소드
}
