package com.home.java.hw221111.question1;

public class EmpDept extends Employee {

	// field
	public String department;

	public EmpDept(String eName, int salary, String department) {
		super(eName, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String geteName() {
		// TODO Auto-generated method stub
		return super.geteName();
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary();
	}

	@Override
	public void getInformation() {
//		super.getInformation();
		System.out.println("이름:" + geteName() + " 연봉:" + getSalary() + " 부서:" + getDepartment());
		System.out.println();
	}

	@Override
	public void print() {
//		super.print();
		System.out.println("수퍼클래스\n서브클래스");
	}

}
