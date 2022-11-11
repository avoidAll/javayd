package com.home.java.hw221111.Question1;

public class Employee {
	
	public String eName;
	public int salary;

	
	public Employee(String eName, int salary) {
		this.eName = eName;
		this.salary = salary;
	}

	public String geteName() {
		return eName;
	}

	public int getSalary() {
		return salary;
	}

	public void getInformation() {
		// 이름과 연봉을 출력
		System.out.println("이름 : " + geteName());
		System.out.println("연봉 : " + this.salary);
	}

	public void print() {
		// 수퍼클래스 문구 출력
		System.out.println("수퍼클래스");
	}

}
