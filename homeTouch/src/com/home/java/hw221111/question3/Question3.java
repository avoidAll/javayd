package com.home.java.hw221111.question3;

public class Question3 {
	public static void main(String[] args) {
		new CultureManager();
	}

	// 메뉴 호출
	public static void showMenu() {
		System.out.println("| 1. 프로그램매니저 | 2. 관람객 | 3. 종료 |");
	}
}

/*
 * Question 3] 1) Culture 클래스를 정의한다. - 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다. -
 * 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다. - 메소드는 다음과 같이 정의한다. (1) public void
 * setTotalScore(int score) : 관객수와 총점을 누적시키는 기능 (2) public String getGrade() :
 * 평점을 구하는 기능 (3) public abstract void getInformation() : 정보를 출력하는 추상메소드
 * 
 * 2) Movie 클래스를 정의한다. - 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다. - 메소드는 다음과 같이 정의한다.
 * (1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을
 * 출력하는 기능
 * 
 * 3) Performance 클래스를 정의한다. - 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다. - 메소드는 다음과 같이
 * 정의한다. (1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수,
 * 총점, 평점을 출력하는 기능
 * 
 * 4) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다. - 출력결과 영화제목 : 추격자 감독 : 7 배우 : 5 영화총점 : 12
 * 영화평점 : ☆☆☆☆ ===================== 공연제목:지킬앤하이드 감독:9 배우:10 공연총점 : 46 공연평점 :
 * ☆☆☆☆☆ - 조건 관객수, 총점과 평점은 입력되는 값에 따라 변동될 수 있습니다.
 */