package com.yedam.java.ch0701;

public class Application {	
	public static void main(String[] args) {
//		Child child = new Child();
//		
//		// 자식 클래스 고유 필드
//		child.lastName = "pual";
//		child.age = 20;
//		
//		// 부모 클래스 필드
//		System.out.println(child.firstName + child.lastName);
//		
////		System.out.println(child.job); // 자식에서 private 된거는 부모가 호출 불가능
//		// 부모는 여러명의 자식 가능
//		// 자식은 한명의 부모만
//		
////		
////		DmbCellPhone dmb = new DmbCellPhone();
////		
////		// 부모 클래스 메소드 사용
////		dmb.powerOn();
////		dmb.sendVoice("안녕하세요");
////		dmb.receiveVoice("안녕하세요 전 김또치입니다");
////		dmb.powerOff();
////		
//		// 자식 클래스 메소드 사용
//		
//		Member member = new Member("고길동", "11542-5534",1);
//		
//		// 부모 객체으 ㅣ필드 사용
//		System.out.println("name : " + member.name);
//		System.out.println("ssn : " + member.ssn);
//		
//		//자식 객체의 필드 사용
//		System.out.println("memberNo : " + member.stdNo);
		
		
//		Child cd = new Child();
//		
//		cd.method1();
//		cd.method2();
//		cd.method3();
//		System.out.println();
//		Compute com = new Compute();
//		
//		double result = com.areaCircle(10);
//		System.out.println(result);
//		System.out.println();
//		
//		SupersonicAirPlane sa = new SupersonicAirPlane();
//		
//		sa.takeOff();
//		sa.fly();
//		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
//		sa.fly();
//		sa.flyMode = SupersonicAirPlane.NORMAL;
//		sa.fly();
//		sa.land();
//		
//		System.out.println();
		
		Child chd = new Child();
		// 위아래 줄을 한줄로 표현하자면, Parent parent = new Child();
		Parent parent = chd;
		
		// 부모 클래스에 있는 필드, 메소드를 사용 하되,
		// 만약 자식클래스에 오버라이딩이 되어있는 메소드가 존재한다면,
		// 부모 클래스에 정의 된 메소드를 사용하지않고 자식클래스에 있는 메소드를 사용하게된다. (: 자동타입변환)
		
		parent.method1();
		parent.method2();
		// parent.method3(); // 현재 parent 변수는 Parent타입이므로 Child 타입안에 있는 method3()을 쓸 수 없다.
	
		
		// 다형성
		// 부모클래스로 모든것을 선언해놓고?
		// 자식크랠스가 상속받은뒤, 자기 입맛따라 오버라이딩하고?
		// 그렇다??
	}
}
