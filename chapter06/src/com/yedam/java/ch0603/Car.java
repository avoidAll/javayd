package com.yedam.java.ch0603;

public class Car {
	// 필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	// this. 는 생성자난 메소드 안에서만 사용 가능
	
	
	/*
	// 생성자
	// 값을 넘겨받는 생성자?
	public Car(String model,String color) {
		
		// field를 가리키는 용도로 this. 를 씀
		this.model = model;
		// 생성자를 호출하는거 자체가 인스턴스를 만들겠다는것.
		// 만들어진 인스턴스의것에다가 입력하기위해 this. 사용
		this.color = color;
	}
	*/
	
	
	// 생성자는 1개이여만 하는 것은 아님
	// 2개 이상이라면, 생성자 오버로딩
	public Car() {
		
	}
	
	public Car(String model) {
//		this.model = model;
		this(model, "은색", 250);
	}
	
	// 서로 다른생성자 끼리는, 필요하다면 호출 할 수 있음
	// 좀더 포괄적으로 포함하고 있는 생성자를 호출하여 이리저리 쓸 수 있는 것
	// 생성자도 일종의 메소드 같은 역할로 이해해보자
	// this를 호출할 때는 반드시 첫 줄에만 호출 가능하다
	// 생성자 내 생성자 호출 시, 어떠한 문장이라도 생성자 호출보다 먼저 있다면 에러 난다 어떠한 명령어도 허용하지 않는다
	
	// this는 인스턴스에 대한 내용.
	// ()가 있다면 생성자, () 없고 . 라면 필드
	
	public Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model,color,250);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
