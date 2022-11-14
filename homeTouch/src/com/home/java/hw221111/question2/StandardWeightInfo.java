package com.home.java.hw221111.question2;

public class StandardWeightInfo extends Human{
	
	public double standardWeight;
	
	public StandardWeightInfo(String hName, double height, double weight) {
		super(hName, height, weight);
	}

	@Override
	public void getInformation() {
		System.out.println(gethName()+"님의 신장 "+getHeight()+", 몸무게 "+getWeight()+", 표준체중 "+getStandardWeight()+" 입니다.");
	}
	
	// 표준체중을 구하는 기능
	public double getStandardWeight() {
		 standardWeight = ((getHeight()-100) *0.9 );
		return standardWeight;
	}
}
