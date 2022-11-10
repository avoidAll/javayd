package com.yedam.java.ch0601;

public class Member {
	// 필드가 private기 때문에 외부에서는 값을 못넣는다
	// getter/setter 통해서 값을 넣던지, 생성자를 통해서 넣던지 두가지가 있다

	// field
	private String id;
	private String tel;
	private int age;

	// constructor

	// method
	public String getId() {
		// 원본데이터(yedam)
		// yedam 님 입니다.
		id += "님 입니다.";
		return id;
	}

	public void setId(String id) {
		this.id = id;
	} // 외부에서 값을 넣어줄때에 사용하기위함

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("0보다 작은 나이가 저장되었ㅅ브니다. 다시 확인하세요");
			return; // 0보다 적은값을 받았기때문에 저장안하고 반환
		} else {
			this.age = age;
		}
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
