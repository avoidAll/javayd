package com.yedam.java.example;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] stAry = null;
		
		//학생 수 입력받고 그만큼 클래스배열 생성
		System.out.print("학생의 수 > ");
		int count = Integer.parseInt(sc.nextLine());
		stAry = new Student[count];
			
		//학생정보 입력
		for(int i=0; i<stAry.length;i++) {
			// 클래스배열에 들어갈 클래스하나를 새로 생성, for문 돌면서 클래스하나씩 생성됨
			// 객체를 깨끗하게 새로이 만들엉
			Student std = new Student(); 
			
			//생성된 클래스에다가 필드값 부여
			System.out.print("학생 이름 > ");
			String name = sc.nextLine();
			std.setsName(name);
			System.out.print("학번 입력 > ");
			String sNo = sc.nextLine();
			std.setsNo(sNo);
			System.out.print("국어 성적 > ");
			int kor = Integer.parseInt(sc.nextLine()); //nextInt
			std.setKor(kor);
			System.out.print("수학 성적 > ");
			int math = Integer.parseInt(sc.nextLine()); //nextInt
			std.setMath(math);
			System.out.print("영어 성적 > ");
			int eng = Integer.parseInt(sc.nextLine()); //nextInt
			std.setEng(eng);
			System.out.println((i+1)+"번째 학생 정보 입력 완료-");
			System.out.println();
			stAry[i] = std; // 배열마다 객체가 들어감
		}
		/*
		for(int i=0; i<stAry.length;i++) {
			stAry[i].getInfo();
		}
		*/
		
		for(int i = 0; i<stAry.length;i++) {
			System.out.println("학생 이름> " + stAry[i].getsName());
		}
	}
}
