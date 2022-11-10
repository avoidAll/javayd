package com.yedam.java.ch0603;

public class MainExample {
	public static void main(String[] args) {
		Car myCar = new Car("투싼", "그레이");
		
		System.out.println("제조회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		// 인스턴스의 값이 변경되었음. myCar라는 인스턴스 하나를 생성했고, 거기에 값을 변동준 두 ㅣ출력한것
		// 우리는 클래스의 값을 건들인 적 없음, 생성되는 인스턴스의 값에 변동을 준것 (반복 설명)
		System.out.println();
		
		Car newCar = new Car(); // constructor Car() is undifined
		System.out.println("제조회사 : " + newCar.company);
		System.out.println("모델명 : " + newCar.model);
		System.out.println("색상 : " + newCar.color);
		// 생성자에 따라 입력받은 변수로써 클래스를 통해 만들수 있는 인스턴스가 달라짐
		// this.는 클래스가 가진 값을 건들이는게 아니라, 그 클래스를 기반으로 하여
		// 생성된 인스턴스가 가질 값을 건들이는 것.
		// 
		// 생성자를 다양하게 만듦으로 하나의 클래스로 여러 인스턴스를 만들 수 있는거같음
		// this. 는 heap 영역에서 생성된 인스턴스를 가리키는것 (반복)
		
		
		System.out.println();
		Car subCar = new Car("아이오닉5","흰색");
		System.out.println("제조회사 : " + subCar.company);
		System.out.println("모델명 : " + subCar.model);
		System.out.println("색상 : " + subCar.color);
		
		// 왜 굳이 this.를 써야하느냐?
		// this.를 쓰지않으면 생성자 내부에서 선언한 변수를 우선시함 ( 변수 이름이 같을 때)
		//	 		  	       this.model = model;   
		// =>   		만들어진인스턴스의model = 외부에서 들어온 model값
		//
		
		
		// ** 생성자 오버로딩
		// 매개변수를 달리하는 생성자라면 같은이름(생성자의이름)으로 여러개 선언 가능
		// 생성자들의 차이는 오직 매개변수 뿐
		//
		// 매개변수의 이름이 달라지는것은 의미 없음. a(A,B)와 a(B,A)는 안된다는 의미지만,
		// 매개변수의 type이 달라지는건 인식가능
		
	}
}
