package com.yedam.java;

public class Exam04 {
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("%d * %d = %2d\n",i,j,i*j);
			}
			System.out.println();
		}
	}
}
