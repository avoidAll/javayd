package com.yedam.java.ch0702;

public class HankookTire extends Tire{

	//매개변수를 가진 생성자가 있기때문에 알아서 처리하라 오류가 뜸
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 " + (maxRotation-accRotation) + "회");
			return true;
		} else {
			System.out.println("###" + location + "HankookTire 펑크 ###" );
			return false;
		}
	}
	
	
	
}
