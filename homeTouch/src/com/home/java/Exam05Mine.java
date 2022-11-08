package com.home.java;

import java.util.Scanner;

public class Exam05Mine {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] diceAry = null;
		int diceSize = 0;
		
		int diceNun = 0;
		int[] list = new int[diceSize];

		while (run) {
			System.out.println("===1. 주사위 크기 | 2. 주사위 굴리기 | 3. 결과 보기 | 4. 가장 많이 나온 수 | 5. 종료===");
			System.out.print(" 메뉴 > ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.print(" 주사위 크기 > ");
				diceSize = Integer.parseInt(sc.nextLine());
				if(diceSize >4 && diceSize<11) {
					diceAry = new int[diceSize];
				} else {
					System.out.println(" 주사위 크기는 5 ~ 10 사이만 가능 \n 다시 시도 :");
				}
				
			} else if (selectNo == 2) { // 주사위굴리기, 주사위눈 5가 나올때까지 몇번 돌렸는지 확인
				int count = 0;
				while (diceNun != 5) {
					diceNun = (int) (Math.random() * diceSize) + 1;
					count++;
					diceAry[diceNun-1] = diceAry[diceNun-1]+1;
				} 
				System.out.printf("%d가 나올때 까지 주사위를 %d번 굴렸습니다\n", diceNun, count);

			} else if (selectNo == 3) { // 결과보기, 반복횟수
				for (int i = 0; i < diceAry.length; i++) {
					System.out.printf("%2d은 %d번 나왔습니다.\n", (i+1), diceAry[i]);
				}
				
			} else if (selectNo == 4) { // 가장 많이 나온 수
				int mxCntDice = diceAry[0]; //나온값 체크
				int mxCntIndex = 0;
				for (int i = 0; i < diceAry.length; i++) {
					if (mxCntDice < diceAry[i]) {
						mxCntDice = diceAry[i];
						mxCntIndex = i;
					}
				}
				System.out.println("가장 많이 나온 수는 " + (mxCntIndex+1) + "입니다.");
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("메뉴 중 선택하세요");
			}
		}
		System.out.println(" 프로그램 종료");
	}
}

