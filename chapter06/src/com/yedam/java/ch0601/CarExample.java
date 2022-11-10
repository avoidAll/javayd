package com.yedam.java.ch0601;

public class CarExample {

	public static void main(String[] args) {
		// 클래스는 일종의 타입이다
		// 클래스를 사용하려면 타입처럼 사용하면 된다?
		
		// 외부에서 값을 주는것은 불가
		Car car1 = new Car();
		System.out.println("최대 스피드 : " + car1.maxSpeed);
		System.out.println("색상 : " + car1.color);
		car1.run();
		
		System.out.println();
		
		// 무조건, "new" 는 "새로운 객체"를 생성해냄
		Car car2 = new Car();
		System.out.println("최대 스피드 : " + car2.maxSpeed);
		System.out.println("색상 : " + car2.color);
		car2.run(); 
		
		
		// 동일한 객체를 참고하고 있는지 확인 해볼것
		if(car1 == car2) {
			System.out.println("car1과 car2는 동일한 객체를 참조합니다.");
		}else {
			System.out.println("car1과 car2는 서로 다른 객체를 참조합니다.");
		}
	}

}
