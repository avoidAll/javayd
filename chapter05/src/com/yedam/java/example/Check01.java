package com.yedam.java.example;

public class Check01 {
	public static void main(String[] args) {
		// 문제1 ) 주어진 배열의 총합과 평균을 구하세요
		int[] array = { 10, 53, 26, 85, 75 };

		int arySum = 0;
		double aryAvg = 0;
		for (int i = 0; i < array.length; i++) {
			arySum += array[i];
		}
		aryAvg = (double) arySum / array.length;
		System.out.printf("총합 : %d, 평균 : %.2f\n", arySum, aryAvg);

		// 문제2 ) 배열의 최댓값과 최솟값을 구하세요
		int aryMax=array[0];
		int aryMin=array[0];
		
		for(int i=0;i<array.length;i++) {
			if( array[i] > aryMax) {
				aryMax = array[i];
			}
			if( array[i] < aryMin ) {
				aryMin = array[i];
			}
		}
		System.out.println(" 최댓값 : " + aryMax + ", 최솟값 : " + aryMin);
		
		// 문제 3 ) 문제 2에서 구한 최댓값과 최솟값이 각각 몇번째 값인지 구하세요.
		
		for(int i=0;i<array.length;i++) {
			if( aryMax == array[i]) {
				System.out.println("최댓값 : 배열의 "+(i+1)+"번째 값");
			}
			if ( aryMin == array[i]) {
				System.out.println("최솟값 : 배열의 "+(i+1)+"번째 값");
			}
		}
	}
}
