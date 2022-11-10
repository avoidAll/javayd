package com.yedam.java.ch0601;

public class Student {
	// field
	// 학생의 이름, 학교 이름, 학번, 학년
	// 국어, 영어, 수학 성적
	private String studentNm;
	private String schoolNm;
	private int studentCd;
	private int grade;
	private int kor;
	private int eng;
	private int math;

	// Constructor
	// 생성자를 통해서 모든 데이터를 입력
	public String getStudentNm() {
		return studentNm;
	}
	public void setStudentNm(String studentNm) {
		this.studentNm = studentNm;
	}
	public String getSchoolNm() {
		return schoolNm;
	}
	public void setSchoolNm(String schoolNm) {
		this.schoolNm = schoolNm;
	}
	public int getStudentCd() {
		return studentCd;
	}
	public void setStudentCd(int studentCd) {
		this.studentCd = studentCd;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}


	
	// Method
	// getInfo() 학생의 내용을 출력할 수 있는 기능
	
}
