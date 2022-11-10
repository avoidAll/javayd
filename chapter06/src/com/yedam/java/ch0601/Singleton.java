package com.yedam.java.ch0601;

public class Singleton {
	
	/*
	// 싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩 기법
	private static Singleton singleton = new Singleton(); // 이 줄이 하나의 객체만 만들도록 해놓은것
	
	// 밖에서 생성자를 못만들게끔 private
	private Singleton() {
		
	}
	
	
	// return singleton;
	// 우리가 만들어준 걸 반환시켜줌
	public static Singleton getInstance() {
		return singleton;
	}
	// getInstance()로 호출하면 우리가 만든 5line의 객체가 반환됨
	// 5line은 주소A를 가진 싱글톤이기에 어디서 누가부르든 같은 객체가 간다는것
	
	*/
	
	//  제 2의 방법
	// static이 메모리에 할당하니까, 호출되지 않는다면 우선 null로 해놓고
	// 어떤 조작에 의해 호출된다면 인스턴스를 하나 만들어서 반환한다는것
	private static Singleton singleton = null;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(singleton == null) {
			return singleton = new Singleton();
		}else {
			return singleton;
		}
	}
	
	
	public void run() {
		System.out.println("싱글톤이 작동중입니다");
	}
	public void connectDB() {
		System.out.println("데이터베이스를 연결합니다");
	}
	// 자주쓰는 기능들을 넣어준다?
	// 한곳에 모아놓고 쓰기에 용이하기에 쓴다는것?
	// 싱글톤은 즐겨찾기, 자주쓰는메뉴 그런것과 비슷하다고 보면 된다
}
