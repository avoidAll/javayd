package com.yedam.java.example;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		//import단축키 : ctrl+shift+o
		
		int studentNum = 0;
		int[] scores = null;//while문 안에 하면 안된다?
		/*  
		 * while문, 변수의 사용범위를 생각해보라
		 * while문은 계속 재실행하고 있는 상태. scores 배열은 while문 내에 선언하면, 계속 재생성 되는거임
		 * 메뉴 선택을 하면, switch문에서 break가 걸리니까, 다음문장인 while문장까지 끄고 나갔다가, 다시 while의 시작점으로 돌아옴
		 * 변수run은 false가 안됐으니까.
		 * while도 for문과 같이 반복문인걸 되새기자. for문안에서 합계를 구할때 변수sum 선언을 안하는 것과 위의 논리가 같다 생각하자
		 */
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println(" 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			
			System.out.println(" 메뉴 선택 > ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			
			//while문 안에서 switch문을 쓰면 break가 흐름을 멈춤.
			//switch문을 사용하고 싶으면 while문을 제어하는 변수를 boolean으로 설정해야함
			switch(selectNo) {
			case 1:
				System.out.print(" 학생 수 > ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				break;
			case 2:
				for(int i=0; i<scores.length;i++) {
					System.out.print("scores["+i+"] > ");
					int score = Integer.parseInt(sc.nextLine());
					scores[i] = score;
				}
				break;
			case 3:
				for(int i=0;i<scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
				break;
			case 4:
				int sum = 0;
				int max = scores[0];
				for(int i=0; i<scores.length;i++) {
					//최고점수
					if(max < scores[i]) {
						max = scores[i];
					}
					
					//총합
					sum += scores[i];
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 : " + ((double) sum / scores.length));
				break;
			case 5:
				run = false;
				System.out.println("프로그램을 종료한=닌다");
				break;
			default:
				System.out.println("정해진 메뉴를 입력핮 ㅣ않았ㅅ브니다");
				System.out.println("다시 입력햦새요.");
			}
			
			
		}
	}
}
