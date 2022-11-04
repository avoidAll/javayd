package com.yedam.java.ch0203;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 자동 타입 변환 */
		byte byteValue = 10;
//		char charValue = byteValue;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("intValue : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
		
		// 강제 타입 변환
		intValue = 44032;
		charValue = (char) intValue ;
		
		longValue = 500;
		intValue = (int)longValue;
		System.out.println(longValue);
		// 강제타입변환 중 여기까진 데이터 손실이 일어나진 않았음
		
		doubleValue = 3.14;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		
		//정수 타입 연산
		byte result = 10 + 20;
		
		byte x = 10;
		byte y = 20;
		
		// xy가 int타입으로 변환되서 처리되기때문에 안된다
//		byte result2 = x + y;
		//젤좋은 수정방법?
		int result2 = x + y;
		//굳이 하겠다면 이렇게도 가능은 함
		byte result3= (byte)(x + y);
		System.out.println(result2+", "+result3);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intResult = charValue1 + charValue2;
		// 문자값을 더했더니 자동으로 int값으로 반환된다
		System.out.println("유니코드 : " + intResult);
		//문자로 출력하고싶으면 강제변환을 시켜야한다
		System.out.println("출력문자 : " + (char)intResult);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		//하나라도 long 타입이 된다고 생각되면 long타입으로 반환 받는게 나을것이다.
		// 그게아니라면 미스매치가 날테니(int값으로하면 문제가 생김)
//		int longResult = value1 + value2 + value3;
		long longResult = value1 + value2 + value3;
		
		int intV1 = 10;
		double doubleV1 = 5.5;
		// double값은 int가 못 담기때문에 오류가 난다
//		int plusV1 = intV1 + doubleV1;
		double plusV1 = intV1 + doubleV1;
		
		int intVar1 = 10;
		double resultVar1 = intVar1/4;
		//왜 2.0이 나오냐면 나누고자하는 intVar1 이 이미 int값이기 때문, 그리고 int값으로 나눴기때문
		System.out.println("10/4의 결과 : " + (intVar1/4));
		System.out.println("10/4의 결과 : " + resultVar1);
		double resultVar2 = intVar1/4.0;
		
		//나누어질 수나 나눌 수 둘중 하나가 실수형이면 원하는 값이 나올 수 있음
		System.out.println("10/4의 결과 : " + resultVar2);
		
		
		int x1 = 1;
		int y1 = 2;
		
		//int와 int 연산이지만, 둘중 하나를 강제타입변환 시키면 소수점까지 바른값이 나옴
		double result1 = (double)x1/y1;
//		double result1 = (double)(x1/y1);
		System.out.println("1/2 결과 : " + result1);
		
		
		// 문자열 결합
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		String str1 = 10 + 2 + "8";
		System.out.println(str1);

		String str2 = 10 + "2" + 8;
		System.out.println(str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println(str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println(str4);
		
		// 기본타입 <-> String
		// 들어있는 값이 10이어야 하며, parseInt는 "를 벗겨낸다 생각하면 됨
		int aVar = Integer.parseInt("10");
		//문법적으론 오류가 없으나, 실행이 안됨
		//문법적으론 오류가 없으나 문자는 숫자 double값에 들어갈수 없기 때문
		//NumberFormatException
//		double bVar = Double.parseDouble("a101.0");
		double bVar = Double.parseDouble("101.0");
		boolean cVar = Boolean.parseBoolean("true");
		
		System.out.println("a : " + aVar);
		System.out.println("b : " + bVar);
		System.out.println("c : " + cVar);

		String strV1 = String.valueOf(10);
		String strV2 = String.valueOf(3.14);
		String strV3 = String.valueOf(true);
		
		System.out.println(strV1);
		System.out.println(strV2);
		System.out.println(strV3);
		
		String strV4 = "" + 105.23;
		System.out.println(strV4);
	}

}
