package com.yedam.java.ch0701;

public class Compute extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("Comte 오버라이드 실행");
		return r*r*Math.PI;
	}
	
}
