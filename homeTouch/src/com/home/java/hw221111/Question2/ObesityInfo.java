package com.home.java.hw221111.Question2;

public class ObesityInfo extends StandardWeightInfo{

	// field
	public double Obesity;
	
	// constructor 
	public ObesityInfo(String hName, double height, double weight) {
		super(hName, height, weight);
	}
	
	
	// method
	@Override
	public void getInformation() {
		if(getObesity() >25 ) {
			System.out.println(gethName()+"님의 신장 "+getHeight()+", 몸무게 "+getWeight()+", 비만입니다.");
		} else {
			System.out.println(gethName()+"님의 신장 "+getHeight()+", 몸무게 "+getWeight()+", 비만이 아닙니다.");
		}
	}
	
	public double getObesity() {
		Obesity = ((getWeight()-getStandardWeight())/getStandardWeight()*100);
		return Obesity;
	}
}
