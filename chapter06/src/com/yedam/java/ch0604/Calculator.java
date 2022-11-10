package com.yedam.java.ch0604;

public class Calculator {
	void powerOn(){
		System.out.println("전원 \"ON\"");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x / (double)y ;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원 \"OFF\"");
	}
	
	
	//// 
	//평균
	double avg(int x, int y){
		// plus() 호출가능
		int sum = plus(x,y);
		double result = sum / 2.0;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	// 메소드는 최소한의 기능으로 만들고
	// 기존에 만들어 놓았던 메소드를 호출하고 조합하여 만들자
	
	
	
	double areaRectangle(double width) {
		//간단한 연산인 경우 width* 를 한 후에 return에 전해줌
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width*height;
	}
	
	
}
