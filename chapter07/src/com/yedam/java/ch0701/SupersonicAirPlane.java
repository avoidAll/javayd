package com.yedam.java.ch0701;

public class SupersonicAirPlane extends AirPlane{
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
	if(flyMode == SUPERSONIC) {
		System.out.println("초음속 비행 모드입니다.");
	} else {
		super.fly();
	}
	
	}
}
