package com.yedam.java.example1110;

public class Customer {
	
	// field
	String customerNm;
	String bankNm;
	int account; // 계좌번호
	double balance; // 잔액
	
	// construtor
	Customer(String customerNm, String bankNm, int account, double balance) {
		this.customerNm = customerNm;
//		Bank.bankNm = bankNm;
//		this.bankNm = Bank.bankNm;
		this.bankNm = bankNm;
		this.account = account;
		this.balance = balance;
	}

	
	// mothod
	public void getInfo() {
		System.out.println("=== 입력 하신 회원 정보 ===");
		System.out.println("이름 : " + customerNm);
		System.out.println("은행 : " + bankNm);
		System.out.println("게좌 : " + account);
		System.out.println("잔액 : " + balance);
	}

	
	public void withDraw() {
		System.out.println("출력하실 경우 아래의 출금으로 출금이 가능합니다");
		System.out.println("원금 : " + balance);
//		System.out.println("금리 : " + Bank.iRate);
		System.out.println("금리 : " + Bank.INTEREST_RATIO*100);
		System.out.println("예상 금액 : " + (balance + (balance*Bank.INTEREST_RATIO)) + "원 입니다.");
	}
}
