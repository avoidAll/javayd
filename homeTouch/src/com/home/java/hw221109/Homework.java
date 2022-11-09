package com.home.java.hw221109;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {

		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60)
				System.out.println("값이 60인 곳의 index : " + i);
		}
		
		System.out.println();
		System.out.println("=============================");
		System.out.println("=============================");
		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (i == 3) {
				continue;
			} else {
				System.out.println("50만 안나오면 된다 : " + arr1[i]);
			}
		}
		
		System.out.println();
		System.out.println("=============================");
		System.out.println("=============================");
		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		Scanner sc = new Scanner(System.in);
		System.out.print("변경을 원하는 인덱스 번호 : ");
		int cIdx = Integer.parseInt(sc.nextLine());
		arr1[cIdx] = 1000;
		System.out.println(cIdx + "의 값은 1000으로 변경되었음");

		System.out.print("\t{ ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("} ");
		
		System.out.println();
		System.out.println("=============================");
		System.out.println("=============================");
		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int arrMax = arr1[0];
		int arrMin = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arrMax < arr1[i])
				arrMax = arr1[i];
			if (arrMin > arr1[i])
				arrMin = arr1[i];
		}
		System.out.println("arr1의 최댓값 : " + arrMax);
		System.out.println("arr1의 최솟값 : " + arrMin);
		
		System.out.println();
		System.out.println("=============================");
		System.out.println("=============================");
		// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int[] mineArr = new int[10];
		System.out.print("배열에 저장하기 위해 양의 정수 10개를 입력하시오.\n > ");
		for (int i = 0; i < mineArr.length; i++) {
			mineArr[i] = sc.nextInt();
			/*
			 * if (i == mineArr.length) { System.out.println("입력 완료"); continue; }
			 */
		}
		System.out.println("입력한 수 중에서");
		for (int i = 0; i < mineArr.length; i++) {
			System.out.print(mineArr[i] + " ");
		}
		System.out.println("까지 입력되었고, 이 중 3의 배수는");
		for (int i = 0; i < mineArr.length; i++) {
			if (mineArr[i] % 3 == 0) {
				System.out.println("\t" + (i + 1) + "번째 값 : " + mineArr[i]);
			}
		}

	}
}
