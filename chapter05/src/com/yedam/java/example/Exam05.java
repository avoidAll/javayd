package com.yedam.java.example;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int diceSize = 0;
		int[] diceAry = null;
		int diceNun = 0;
		int count = 0;
		int[] list = new int[diceSize];
		int mxCntDice = 0;

		while (run) {
			System.out.println("===1. 주사위 크기 | 2. 주사위 굴리기 | 3. 결과 보기 | 4. 가장 많이 나온 수 | 5. 종료===");
			System.out.print(" 메뉴 > ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.print(" 주사위 크기 > ");
				diceSize = Integer.parseInt(sc.nextLine());
				diceAry = new int[diceSize];
				count = 0;

			} else if (selectNo == 2) { // 주사위굴리기, 주사위눈 5가 나올때까지 몇번 돌렸는지 확인
				do {
					diceNun = (int) (Math.random() * diceSize) + 1;
					count++;
					System.out.printf("%d가 나올때 까지 주사위를 %d번 굴렸습니다\n", diceNun, count);
					
					for (int i = 0; i < count; i++) {
						int index = diceAry[i] - 1;
						list[index]++;
					}
				} while (diceNun != 5);

			} else if (selectNo == 3) { // 결과보기, 반복횟수
				for (int i = 0; i < list.length; i++) {
					System.out.printf("%2d은 %d번 나왔습니다.\n", diceNun, list[i]);
				}
			} else if (selectNo == 4) { // 가장 많이 나온 수
				mxCntDice = list[0];
				for (int i = 0; i < list.length; i++) {
					if (mxCntDice < list[i]) {
						mxCntDice = list[i];
					}
				}
				System.out.println("가장 많이 나온 수는 " + mxCntDice + "입니다.");
			} else if (selectNo == 5) {
				run = false;
				System.out.println(" 프로그램 종료");
			} else {
				System.out.println("메뉴 중 선택하세요");
			}
		}
	}
}
