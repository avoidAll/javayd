package com.yedam.java.ch0702;

public class Application3 {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			// 내가 만든 타입(좌변)이 우변과 같은지
			// 좌항(객체) 우항(타입)
			Child child = (Child) parent;
			System.out.println("method1 - child 변환 성공");
		}else {
			System.out.println("변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - child 변환 성공");
	}
	
	
	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method2(parentB); // 캐스팅오류 뜸
		
		Driver driver = new Driver();
		
		// bus, taxi -> vehicle
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//driver.drive(Vehicle vehicle = new Bus())
		driver.drive(bus);
		//매개변수로 객체를 던져버린 것, 넣어준 것
		// 매개변수로 받을수있는 Vehicle vehicle은 부모니까 ,Bus bus를 받을 수있다)
		// 타고들어가면 drive의 vehicle.run()은 vehicle의 것이 실행되는 것이 아니라
		// 자식인 bus의 것이 실행 되는것
		driver.drive(taxi);
		System.out.println();
		System.out.println();
		
		Animal animal = null;
		animal = new Cat();
		animal.speak();
		animal = new Dog();
		animal.speak();
		
		System.out.println();
		System.out.println();
		
		Parent parent = new Child();
		parent.field = "parent";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "child";
//		parent.method3();
		
		// Casting (강제타입변환)
		Child child = (Child) parent;
		child.field2 = "parent";
		child.method3();
		
		child.field = "parent";
		
		System.out.println();
		System.out.println();
		
	}
}
