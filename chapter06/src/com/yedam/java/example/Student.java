package com.yedam.java.example;

public class Student {
	
	// 1) 각 필드를 저장할 수 있는 getter, setter 작성 v
	// 2) 모든 정보를 출력할 수 있는 메소드 하나 작성 v
	// 3) School 클래스 만들고 main을 작성해서 학생의 정보를 넣는 프로그램 v/
	// 4) 학생 수를 입력 받고, 각 필드의 데이터를 받아와서 학생 정보가 담긴 프로그램
	// 5) 모든 정보를 출력.
	
	
	// field
	private String sName;
	private String sNo;
	private int kor;
	private int math;
	private int eng;
	
	
	// constructor
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	// method
	public void getInfo() {
		System.out.println("==== 학생 정보 ====");
		System.out.println(" 이  름 : " + sName);
		System.out.println(" 학  번 : " + sNo);
		System.out.println("국어 성적 : " + kor);
		System.out.println("수학 성적 : " + math);
		System.out.println("영어 성적 : " + eng);
		System.out.println("-----------------------");
	}
}
