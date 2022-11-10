package com.yedam.java.example1110;

import java.util.Scanner;

public class BankExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 문제>
			// 은행 고객 정보를 관리하는 클래스
			// 클래스는 3개를 만들면 됨.
			// 		1) main 2) Customer 3) Bank
			// 1) main -> 생성자를 통한 고객의 정보를 저장, 출력
			// 2) Bank -> 해당은행의 금리를 저장
			//		금리출력 : 현재 잔액 + (현재 잔액 * 금리)
			// 3) Customer -> 고객의 정보를 저장
			//		이름, 은행명, 계좌, 잔액의 필드 존재
			//		getInfo() 메소드를 통해서 입력한 정보를 출력
			// 		withDraw(): 출금할 때 정보를 출력
				
		Scanner sc = new Scanner(System.in);
		String confirm;
		
		Customer customer = new Customer("고길동", "농협", 123456888, 1000000);
		
		customer.getInfo();
		
		customer.withDraw();
		System.out.println("출금 하시겠습니까? Y/N");
		
		confirm = sc.nextLine();
		if(confirm.toLowerCase().equals("y")) {
			
			System.out.println("출금 완료");
			
		} else {
			System.out.println("시스템 종료");
		}
		
	}
}
