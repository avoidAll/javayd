package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		// 배열을 선언
//		int[] intAry; //보통은 이렇게 씀, 타입뒤에[]을 붙임
		//배열을 선언 -> 모든 타입을 값으로 가질 수 있음
//		int intAry2[];
//		int[] intAry = null;
//		System.out.println("intAry[0] : " + intAry[0]);
		
		//값을 초기화 하면서 배열을 생성
		int[] scores = {83, 90, 87};
		
		System.out.println("score[0] : " + scores[0]);
		System.out.println("score[1] : " + scores[1]);
		System.out.println("score[2] : " + scores[2]);
		
		int sum = 0;
		for(int i =0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
		
		int[] scoreList = null;
		scoreList= new int[] {83,90,87};
		
		///////////////////////////////////////////////////
		int[] scList9999 = new int[] {55,326,32}; //정식방법, 이걸로 그냥 기억한다손 쳐버렸!
		int[] scList99999 = {55,326,32}; //자바에서 허용해준 예외방법
		///////////////////////////////////////////////////
		
		sum = add(new int[] {83,80,87});
		
		//new연산자로 배열 생성
		int[] array = new int[3];
		for(int i = 0; i<3 ; i++) {
			System.out.println("array["+i+"] : "+array[i]);
		}
		
		String[] strAry = new String[4];
		for(int i = 0; i < strAry.length; i++) {
			System.out.println("strAry["+i+"] : "+ strAry[i]);
		}
		
		for(int i = 0; i < strAry.length; i++) {
			strAry[i] = String.valueOf(i);
		}
		
		for(int i = 0; i < strAry.length; i++) {
			System.out.println("strAry["+i+"] : "+ strAry[i]);
		}
		
		
	}
	
	static int add(int[] numList) {
		int sum=0;
		for(int i=0;i<numList.length;i++) {
			sum += numList[i];
		}
		return sum;
	}
}
