package com.yedam.java.ch0601;

public class Application {
	
	// field
	int staticTest = 0;
	
	
	public static void main(String[] args) {
		// 나 자신을 인스턴스화 시키고
		Application ap = new Application();
		// 내자신에 있는 필드값 변경 가능
		ap.staticTest = 2;
		
		Shoes shoes = new Shoes();
		shoes.makeRunning();
		shoes.makeSlipper();
		shoes.makeMule();
		shoes.getCount(); 
		
		System.out.println(Shoes.totalCount); //3
		
		ConstantNo csno = new ConstantNo();
		// 클래스를 만들고, 인스턴스화 시키면 쓸 수 있다?
		System.out.println(csno.word); 
		System.out.println(csno.words);
		
		//객체를 만들지않고 바로 가져온다, static이라서
		System.out.println(ConstantNo.EARTH_ROUND);
		
		
		Access access = new Access();
		
		// 1) public
		access.free = "public";
		access.free();
		// 2) private
//		access.privacy = "privacy";
//		access.privacy();
		// 3) protected
		access.parent = "parent";
		// 4) default
		access.basic = "basic";
		
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2); // s1,s2 변수값은 다르지만, 같은 주소값이 출력되므로
								// 둘은 같음
		
		s1.run();
		s2.connectDB();
		
		
		Member mem = new Member();
		
		// 1) mem의 인스턴스 필드에 접근 가능한지 확인
		// 2) setter, getter로 데이터 입력 및 출력
		mem.setId("yedam");
		mem.setTel("010-1023-1234");
		mem.setAge(10);
		
		System.out.println("id : " + mem.getId());
		System.out.println("tel : " + mem.getTel());
		System.out.println("age : " + mem.getAge());
		 
	}
}
