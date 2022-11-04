package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 127;
		
//		byte var5 = 128;
		System.out.println(var1);
		
		long var6 = 100000000000L;
		long var7 = 1000000;
		
		//char 타입
		
		char v1= 'A';
		char v2= '가';
		char v37= '괢';
		int v3 = v1;
		char v88 = 78;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v37);
		System.out.println(v3);
		System.out.println(v88);
		
		//String, 본래는 타입이라기보단 클래스인데, 타입으로써 쓸수있음
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(job);
		System.out.println(job.charAt(3)); //charAt() 몇번째 인덱스의 값을 원하는지
		
		//char VS String
		char v4 = 'a';
		String v5 ="-";
		
		String str1 = "누군가 \"안녕\"하면서 인사했다.";
		
		// float
		
		float num1 = 3.14F;
		double num2 = 3.14;
		
		float varF = 0.1234567890123456789F;
		double varD = 0.1234567890123456789F;
		
		System.out.println(varF);
		System.out.println(varD);
		
		//boolean
		
		boolean stop = (1>2);
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다");
		}
	}

}
