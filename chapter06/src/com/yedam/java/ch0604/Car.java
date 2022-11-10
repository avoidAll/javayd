package com.yedam.java.ch0604;

public class Car {
	// field
	int gas;

	// Constructor

	// Method
	void setGas(int gas) {
		// 기존에 있는 gas(:5)라는 값에, 내가 받은 gas(:11)라는 값을 넣을 것
		this.gas = gas;
	}

	boolean isLeftGas() {
		// 여기는 this.를 안써도 됨, 자동으로
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		// return구문이 존재하기에 if-else로 만들지 않았다
		// return이 있으면 그 다음줄은 사용치 않기때문에 ?
		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
//			if (this.gas > 0) {
			if (isLeftGas()) { // 같은 클래스 내에 존재한다면 인스턴스를 생성핮 ㅣ않더라도 호출가능
				System.out.println("달립니다. gas 잔량 : " + this.gas + ")");
				this.gas--;
			} else {
				System.out.println("멈춥니다. gas 잔량 : " + this.gas + ")");
				// break는 반복문을 멈추게하는거고, return은 해당 메소드 자체를 멈추게 함.
				return;
			}
		}
	}
}
