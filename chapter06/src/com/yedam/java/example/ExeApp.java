package com.yedam.java.example;

import java.util.Scanner;

public class ExeApp {
	
	Scanner sc = new Scanner(System.in);
	Bank[] Bary = null;
	int menuNo;
	
	public ExeApp() {
		while(true) {
			showMenu();
			menuNo = Integer.parseInt(sc.nextLine());
			
			switch (menuNo) {
			case 1:
				setSize();
				break;
			case 2:
				setInfo();
				break;
			case 3:
				break;
			case 4:
				showInfo();
				break;
			case 5:
				break;
			case 6:
				break;
			default:
			}
		}
	}

	// 메뉴 출력
	public void showMenu() {
		System.out.println("============================================================================");
		System.out.println("| 1. 회원 수 입력 | 2. 정보 입력 | 3. 단건 조회 | 4. 모두 조회 | 5. 회원 삭제 | 6. 종료 |");
		System.out.println("============================================================================");
	}
	
	
	// menu 1: 
	public void setSize() {
		System.out.println("회원의 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		Bary = new Bank[count];
	}
	
	// menu 4:
	public void showInfo() {
		for(int i=0; i<Bary.length;i++) {
			Bary[i].getInfo();
		}
	}
	
	// menu 2:
	// 회원 정보 입력
	public void setInfo() {
		for (int i = 0; i < Bary.length; i++) {

			Bank bank = new Bank();
			System.out.println("계좌 번호 > ");
			int account = Integer.parseInt(sc.nextLine());
			bank.setAccount(account);

			System.out.println("은행 입력 > ");
			String bName = sc.nextLine();
			bank.setBank(bName);

			System.out.println("금액 설정 > ");
			int money = Integer.parseInt(sc.nextLine()); // nextInt
			bank.setMoney(money);

			System.out.println("고객 이름 > ");
			String name = sc.nextLine();
			bank.setName(name);

			Bary[i] = bank; // 배열마다 객체가 들어감
		}
	}
}
