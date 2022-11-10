package com.yedam.java.example;

import java.util.Scanner;

public class Application {
	
	// 배열
//	int[] ary = new int[6];
	// 배열 진화
//	클래스[] ary2 = new 클래스[6];
	// 2차원 배열
//	int[][] ary3 = new int[5][5];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// sc.next() 엔터는 값으로 안가져감. console에 enter값은 남아있음
		// sc.nextLine() 엔터까지 값으로 가져감.
		
		System.out.println("회원의 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		Bank[] Bary = new Bank[count];
	
		for(int i=0; i<Bary.length;i++) {
			
			Bank bank = new Bank();
			System.out.println("계좌 번호 > ");
			int account = Integer.parseInt(sc.nextLine());
			bank.setAccount(account);
			
			System.out.println("은행 입력 > ");
			String bName = sc.nextLine();
			bank.setBank(bName);
			
			System.out.println("금액 설정 > ");
			int money = Integer.parseInt(sc.nextLine()); //nextInt
			bank.setMoney(money);
			
			System.out.println("고객 이름 > ");
			String name = sc.nextLine();
			bank.setName(name);
			
			Bary[i] = bank; // 배열마다 객체가 들어감
		}
		
		for(int i=0; i<Bary.length;i++) {
			Bary[i].getInfo();
		}
	}
}
