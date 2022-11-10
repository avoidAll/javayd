package com.yedam.java.ch0604;

public class MainExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		// 이렇게 myCalc라고 이름을 선언하면서 해야 내부로 접근 할 수 있다.
		
		// return 되는 값이 없기 때문에, 변수 선언하고 값을 대입하지 않아도 된다
		myCalc.powerOn();
		int sumRes = myCalc.plus(34675, 324);
		
		System.out.println("sum : " + sumRes);
		
		byte x = 10;
		byte y = 4;
		double diviRes = myCalc.divide(x, y);
		System.out.println(diviRes);
		
		System.out.println("================");
		
		
		Computer myCom = new Computer();
		// 배열로 값을 넘기는 방식은 두 가지.
		// 변수르 선언해서 값을 담고
		int[] values1 = { 1,2,3 };
		// 그 후 해당 변수를 통째로 넘겨주는것
		int intResult1 = myCom.sum1(values1);
		System.out.println("intResult1 : " + intResult1);
		
		// 한번 사용할 변수면? 굳이 선언할 필요가 없다?
		// 바로 배열을 선언하면서 바로 넘겨준다?
		int intResult2 = myCom.sum1(new int[] { 1,2,3,4,5,6,7});
		System.out.println("intResult2 : " + intResult2);
		
		// 방법1은 번거롭다는 단점이 있음?
		// 그래서 java가 새롭게 제안하는 방법
		
		// 배열타입으로 지정한경우는 맞춰서 넘겨줘야한다
		// 밑의방법은 그냥 값을 넘겨주면, 알아서 배열로 받고 알아서 처리한다?
		// 우리는 그냥 허용하는 형태로 값을 넘겨주면 된다?
		// 처리는 그냥 배열처럼 하면 된다. 다만 호출할 때 무엇으로 호출하면 되는지로 결정나는것??
		
		
		System.out.println("================");
		int intResult3 = myCom.sum2(1,2,3);
		System.out.println("intResult3 : " + intResult3);
		
		int intResult4 = myCom.sum2(1,2,3,4,5,6,7);
		System.out.println("intResult4 : " + intResult4);
		
		myCalc.execute();
		
		double result1 = myCalc.areaRectangle(10);
		double result2 = myCalc.areaRectangle(10,20);
		
		System.out.println("10*10 정사각형의 넓이 : " + result1);
		System.out.println("10*20 직사각형의 넓이 : " + result2);
	}
}
