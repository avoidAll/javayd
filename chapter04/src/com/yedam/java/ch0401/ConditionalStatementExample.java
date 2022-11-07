package com.yedam.java.ch0401;

public class ConditionalStatementExample {
	public static void main(String[] args) {
		// 기본IF문
		int score = 90;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다");
		}
		System.out.println("if문 상관없이 실행됩니다");
		
		if(score <90)
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다");
			
		// if~else문
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다");
		}else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다");
		}
		
		
		// if~else if~else문
		if(score >= 90) {
			System.out.println("점수 100~90");
			System.out.println("등급 A");
		}else if(score>=80) {//score < 90 &&score>=80 
			System.out.println("점수 89~80");
			System.out.println("등급 B");
		}else if(score>=70) {
			System.out.println("점수 79~70");
			System.out.println("등급 C");
		}else {
			System.out.println("점수 70미만");
			System.out.println("점수D");
		}
		
		
		/*
		 *
		  
		 1) 0.0 <= Math.random() < 1.0
		 2) 0.0 [*10] <= Math.random() [*10] < 1.0 [*10]
		 3) (int) 0 <= (int) Math.random() [*10] < (int)10
		 4) (int) 0+1 <= (int) Math.random() [*10] +1 < 10 +1
		 5) :: 1,2,3,4,5,6,7,8,9,10
		 
		 => (int)(Math.random() * count ) + start
		 
		 start 시작숫자맞추기위해서 더해주고,
		 정수가 필요하니 int로 형변환,
		 count는 가져올 갯수
		 * 
		 * */
		
		int num = (int)(Math.random() *6) +1;
		
		if(num==1) {
			System.out.println("1번");
		}else if(num ==2) {
			System.out.println("2번");
		}else if(num ==3) {
			System.out.println("3");
		}else if(num ==4) {
			System.out.println("444");
		}else if(num==5) {
			System.out.println("55");
		}else if(num==6) {
			System.out.println("6");
		}
		
		
		// switch문
		num = (int)(Math.random() * 6) +1;
		
		switch(num) {
		case 1:
			System.out.println("1이 나옴니다");
			break;
		case 2:
			System.out.println("2이 나옴니다");
			break;
		case 3:
			System.out.println("3이 나옴니다");
			break;
		case 4:
			System.out.println("4이 나옴니다");
			break;
		case 5:
			System.out.println("5이 나옴니다");
			break;
		default:
			System.out.println("6이 나옴니다");
		}
		
		// break문이 없는 case
		int time = (int) (Math.random() *4) + 8;
		System.out.println("[현재시각 : " + time +"시]");
		
		switch(time){
		case 8:
			System.out.println("출근합니다");
		case 9:
			System.out.println("회의를합니다");
		case 10:
			System.out.println("업무를 볼겁니다");
		default:
			System.out.println("외근을 나갑니다");
		}
		
		
		// char 타입의 switch문일때는 종종 일부러 break를 빼기도 함
		// 실습예시 ) 쇼핑몰 사이트
		// 우수회원 - A, 일반회원 - B, 손님

		
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원입ㄴ다");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원입니다");
			break;
		default:
			System.out.println("손님입ㄴ디ㅏ");
		}
		
		
		// String 타입의 switch문
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("5백만원");
			break;
		default:
			System.out.println("300만원");
		}
	}
}
