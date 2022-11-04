package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n",value);
		System.out.printf("상품의 가격:%6d원\n",value);
		System.out.printf("상품의 가격:%-6d원\n",value);
		System.out.printf("상품의 가격:%06d원\n",value);
		
		double area = 3.14159 * 10 * 10;
		System.out.println(area);
		System.out.printf("반지름이 %d인 원의 넓이 :%10.2f\n",10,area);
		
		Scanner sc = new Scanner(System.in);
		
		//Enter 입력전까지 입력한 문자열을 한줄로 인식함
//		String str = sc.nextLine();
		
		//nextLine과 next는 같이 쓰면 안됨
		//next()와 nextInt()는 Enter값을 인식못함
		/*
		String str = sc.next();
		int var = sc.nextInt();
		System.out.println("입력 : " +str +", " + var);
		*/
		
		
		/*
		System.out.print("첫번째 : ");
		String x = sc.nextLine();
		System.out.print("두번째 : ");
		String y = sc.nextLine();
		int result = Integer.parseInt(x) + Integer.parseInt(y);
		System.out.println("결과 : " + result);
		//nextLine은 같이 쓰지마세요. 지금은.
		*/
		
		/*
		//nextInt는 공백으로 각각 인지함
		int v = sc.nextInt();
		int w = sc.nextInt();
		System.out.println("입력 : " + (v+w));
		 */
		
		
		String inputData;
		
		while(true) {
			inputData = sc.nextLine();
			System.out.printf("입력된 문자열: %s\n", inputData);
			if(inputData.equals("exit")) {
				break;
			}
		}
		System.out.println("종료");
	}
}
