package com.yedam.java.ch0703;

public class Application {
	public static void main(String[] args) {

		// 추상 클래스는 자신을 객체화(인스턴스화) 할 수 없다.
//		Phone phone = new Phone("아이폰");
/*
		SmartPhone smartPhone = new SmartPhone("고진감래");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		*/
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("====\t====\t====\t====\t");
		
		// 추상 만들고
		Animal animal = null;
		
		// 부모클래스를 사용하되, 자식객체를 씀 :: 자동타입변환
		animal = new Dog();
		animal.sound(); // 실행하면 animal에 있는게 아니라 강아지에 있는것이 실행될것
		
		animal.breathe();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("====\t====\t====\t====\t");
		
		// 매개변수를 활용한 자동타입변환?
		animalSound(new Dog());
		animalSound(new Cat());

		
	}
	
	// 매개변수를 활용한 자동타입변환?
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
