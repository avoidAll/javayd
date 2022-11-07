package com.yedam.java.ch0402;

import java.util.Scanner;

public class ConditionalStatementSubject {
	public static void main(String[] args) {
		// 문제1) 책 161p, 5번
		// for문을 이용해서 다음과 같이 *를 출력하는 코드
		
		
		for(int i=1; i<5;i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-------------");
		String tree = "";
		for(int i = 1 ; i <= 5; i ++) {
			tree += "*";
			System.out.println(tree);
		}
		
		
		// 문제2) for문을 이용해서 1부터 100까지의 정수 중에서
		//		2의 배수가 아닌 숫자의 갯수를 구하세요.
		
		int cnt=0;
		for(int i=0; i<101; i++) {
			if(i%2 == 0) continue;
				cnt++;
		}
		System.out.println(cnt);
		
		//문제 3) 책 161p, 4번
		//		중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해 중
		//		 첫번째로 구해진느 값을 (x,y) 형태로 출력
		//		단, x와 y는 10이하의 자연숭빈디ㅏ.
		
		
		
		outter: for(int x=1;x<11;x++) {
			for(int y=1; y<11;y++) {
				if( 4*x+5*y==60 ) {
					System.out.println("("+x+","+y+")");
					break outter;
				} 
			}
		}
		
		
		// 문제4) do~while문과 Math.random() 함수를 이요
		//		1~10의 정수중 7이라는 수가 나올때 까지 숫자를 출력
		
		int randNum;
		do {
			randNum = (int)(Math.random() *10) +1;
			System.out.println(randNum + "= 7 같을때 까지");
		} while( randNum != 7);
		
		
		// 문제5) 책 161p 3번
		//		 while문과 Math.random() 함수를 이용
		//		2개의 주사위를 던졌을 때 숫자를 (숫자1,숫자2)로 출력
		//	 	숫자의 합이 5일 경우에 종료, 아닐경우 계속 던짐
		//		최종으로 주사위를 몇번던졌는지 횟수 출력
		//		삿자의 합이 5가되는 조합은 1,4/ 4,1/ 2,3/ 3,2
		
		
		int diceCnt=0;
		while( true ) {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			diceCnt++;
			System.out.printf("(%d, %d)>>%2d회 던짐\n",dice1,dice2,diceCnt);
			if( dice1 + dice2 == 5 ) {
				break;
			}
		}
		System.out.println("주사위를 던진 횟수는 총"+diceCnt+"번 입니다");
	}
}
