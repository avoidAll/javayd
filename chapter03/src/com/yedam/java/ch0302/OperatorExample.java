package com.yedam.java.ch0302;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부호 연산자
		int a = -100;
		int result1 = +a;
		int result2 = -a;
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		byte b = 100;
//		byte result3 = (byte)(b*(-1));
		//-b 결과는 int 값이지만, 강제타입변환 시키면서 result3에 넣어주니 괜찮아짐
//		byte result3 = (byte)-b;
		int result3 = -b;
		System.out.println("result3 : " + result3);
		
		int aaa =1;
		int bbb =2;
		int ccc = aaa+ ++bbb;
		
		//증감연산자
		int x =10;
		int y =10;
		int z;
		System.out.println("-------------------------");
		x++;
		++x;
		System.out.println("x="+ x);
		System.out.println("-------------------------");
		y--;
		--y;
		System.out.println("y="+y);
		
		System.out.println("-------------------------");
		z= x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("-------------------------");
		z= ++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("-------------------------");
		z = ++x + y++; // 15+8 = 23
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = 5;
		y =5;
		System.out.println("-------------------------");
		z = x++ + --y; // 9 = 5 + 4
		System.out.println("z = " + z); //9
		System.out.println("x = " + x); //6
		System.out.println("y = " + y); //4
		
		System.out.println("-------------------------");
		z = --x + y++; // 9 = 5 + 4
		System.out.println("z = " + z); // 9
		System.out.println("x = " + x); // 5
		System.out.println("y = " + y); // 5
		
		System.out.println("-------------------------");
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		boolean isOpen = true;
		
		if(!isOpen) {
			System.out.println("영업시간이 종료되었ㅅ브니다.");
		}else {
			System.out.println("영업 중ㅇ비니다");
		}
		
		
		System.out.println("-------------------------");
		//산술 연산자
		int v1= 5;
		int v2=2;
		
		int result;
		result = v1+v2;
		System.out.println("result : " + result);
		
		result = v1-v2;
		System.out.println("result : " + result);
		
		result = v1*v2;
		System.out.println("result : " + result);
		
		result = v1/v2;
		System.out.println("result : " + result);
		
		result = v1%v2;
		System.out.println("result : " + result);
		
		
		//비교 연산자
		int num1 = 10;
		int num2 = 10;
		boolean bResult;
		
		bResult = (num1 <= num2);
		System.out.println("<= : " + bResult);
		
		bResult = (num1 >= num2);
		System.out.println(">= : " + bResult);
		
		bResult = (num1 == num2);
		System.out.println("== : " + bResult);
		
		bResult = (num1 != num2);
		System.out.println("!= : " + bResult);
		
		
		char char1 = 'A';
		char char2 = 'B';
		System.out.println("문자 비교 : " + (char1 > char2));
		
		int v3 = 1;
		double v4 = 1.0;
		System.out.println("int VS double : " + (v3 == v4));
		
		float v5 = 0.1F;
		double v6 = 0.1;
		System.out.println("float VS double : " + (v5 == v6));
		//float과 double이 다르다고 나오는 이유는 정밀도가 다르기 때문
		System.out.println("float VS float : " + (v5 == (float)v6));
		
		
		
		//  논리 연산자
		int charCode = 'A';
		
		//유니코드 중 65보다 크거나 같고 90보다 작거나 같으면 대문자
		if(charCode >= 65 && charCode <=90) {
			System.out.println("대문자");
		}
		
		//유니코드 중 97보다 크거나 같고 122보다 작거나 같으면 소문자
		if(charCode >= 97 & charCode <=122) {
			System.out.println("대문자");
		}
		//보통 &보다 &&을 더 선호한다, &&는 하나만false만 판단되어도 뒤의 연산은 안해도되기때문
		
		//유니코드 중 48보다 크고 57보다 작으면 숫자 0~9
		if(charCode > 48 && charCode <57) {
			System.out.println("숫자 0~9");
		}
		
		int numValue =6;
		if ((numValue%2 == 0) ||(numValue%3==0)) {
			//이또한 &&와 같이 |하나만써도 되고 ||둘다 써도되나 ||를 더 선호함. (연산 간편히)
			//| 하나짜리는 비트연산자
			System.out.println("2또는 3의 배수군요");
		}
		
		
		// 복합 대입 연산자
		int resultA = 0;
		resultA += 10; //10
		System.out.println(resultA);
		resultA -= 5; //5
		System.out.println(resultA);
		resultA *= 3; //15
		System.out.println(resultA);
		resultA /= 5; // 3
		System.out.println(resultA);
		resultA %= 3;  //0
		System.out.println(resultA);
//		System.out.println(resultA+=3);
		
		
		// 삼항연산자
		int score = 95;
		char grade = score > 90 ? 'A' : 'B' ;
		System.out.printf("성적은 %d점이고요, 등급은 \"%c\"입니다 \n",score,grade);
		
		
		int age = 27;
		String message = (age > 20)  ? "성인입니다" : "아직 민증에 잉크도 안 말랐습니다" ;
		System.out.printf("나이는 %d살이며 %s\n", age, message);
		
	}

}
