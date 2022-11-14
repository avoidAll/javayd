package com.home.java.hw221111.question2;

public class Human {
	public String hName;
	public double height;
	public double weight;
	
	public Human(String hName, double height, double weight) {
		super();
		this.hName = hName;
		this.height = height;
		this.weight = weight;
	}
	
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void getInformation() {
		System.out.println(gethName()+"님의 신장 "+getHeight()+", 몸무게 "+getWeight());
	}
}
