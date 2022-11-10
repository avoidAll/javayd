package com.yedam.java.ch0601;

public class Access {
	// 접근제한자에 따라 쓸수있는게 달라진다
	// 대상 : 모든 속성, 필드, 메소드, 생성자 등 자바의 모든 전부
	// public  누구나, 어디서든 접근 가능 
	// private : 내가 속한 클래스 내부에서만 사용 가능
	// protected : 상속 받은 상태에서 부모-자식간 사용 가능(패키지 달라도 사용 가능)
	//				같은 패키지 내에서 사용 가능
	// default : 같은 패키지 내에서 사용 가능, 패키지가 다르면 사용 불가
	
	
	// field
	public String free;
	private String privacy;
	protected String parent;
	String basic;
	
	// constructor
	
	
	// method
	public void free() {
		System.out.println("접근 가능합니다.");
		//다른 클래스에선 못불러냈지만, 같은 클래스 내의 다른 메소드를 통해서 호출해낼 수 있다.
		privacy();
	}
	
	private void privacy() {
		System.out.println("접근이 불가능 합ㄴ디ㅏ");
	}
}
