package com.yedam.java.example;

import java.util.Scanner;

public class Exam07 {
	// 로또 번호를 예측하는 프로그램
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		int[] numList = null;
		int count = 0; //index 일때는 -1, ++index이라면 0일수가 없다?

		while (run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println(" 1. 새로고침 | 2. 번호예측 | 3. 번호삭제 | 4. 번호출력 | 5. 분석 | 6. 종료 ");
			System.out.println("---------------------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) { // 로또 번호를 담을 수 있는 배열 초기화
				numList = new int[6]; //새로운 배열을 정의하겠다, 기존의 값이 있든 없든?
				count = 0;
			} else if (selectNo == 2) { // 1~45 중에 랜덤한 값을 가져옴
				if( count < numList.length ) {
					int num = (int)(Math.random()*45)+1;
//					int num = (int)(Math.random()*5)+1;
					//주의할 점 count는 무한정 늘어나선 안된다
					numList[count++] = num; //count가 index의 역할도 하면서, 갯수를 세는 역할도 함
					System.out.println("현재 가져온 수의 갯수 : " + count);
				}else {
					System.out.println("더이상 수를 가져올 수 없습니다.");
				}
			} else if (selectNo == 3) { // 기존의 값 중 가장 최근의 값을 삭제 ( 하나만 )
				//count =6, (index로치면 count-1) 
				numList[--count] = 0;
				System.out.println("현재 " + count + "개까지 수를 뽑았습니다");
			} else if (selectNo == 4) { // 배열의 값을 전부 출력}
				System.out.println("현재 가지고 있는 수의 갯수 : " + count);
				for( int i = 0; i<count; i++) {
					System.out.print(numList[i] + " ");
				}
				System.out.println();
			} else if (selectNo == 5) { // 중복유무와 중복된 값이 몇번 중복되었는지
				int[] list = new int[45];
				
				// (이해)개표
				for(int i =0; i< count; i++) {
					int index = numList[i] -1;
					list[index]++;
				}
				
				// (이해)개표 상황 공유
				boolean isChecked = false;
				for(int i=0; i<list.length;i++) {
					if(list[i] <= 1) continue;
					System.out.printf("숫자 %d의 경우 %d번 중복되었습니다.\n",(i+1), list[i]);
					isChecked = true;
				}
				
				if(isChecked) {
					System.out.println("중복값이 존재하지 않습니다.");
				}
			} else if (selectNo == 6) {
				run = false;
				System.out.println(" 프로그램 종료");
			} else {
				System.out.println("정해진 번호를 입력핫에ㅛ");
				System.out.println("닷 ㅣ입력하세요");
			}
		}
	}
}
