package com.home.java.hw221111.Question3;

public abstract class Culture {
	// field
	public String subject; // 제목
	public int directors; // 참여 감독 수
	public int actors; // 참여 배우 수
	public int audience = 0; // 관객 수
	public int totalAudience = 0; // 총 관객 수
	public int totalScore = 0; // 총점
	public String grade; // 평점

	// constructor

	// Method
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getDirectors() {
		return directors;
	}

	public void setDirectors(int directors) {
		this.directors = directors;
	}

	public int getActors() {
		return actors;
	}

	public void setActors(int actors) {
		this.actors = actors;
	}

	public int getAudience() {
		return audience;
	}

	public void setAudience(int audience) {
		this.audience = audience;
	}

	public int getTotalScore() {
		return totalScore;
	}

	// 1-1) 관객수와 총점을 누적시키는 기능

	// 입력받은 점수마다 총점에다가 합산하고,
	// 입력받을 떄마다 관객 수가 하나씩 늘어나는셈
	// setTotalScore에서 audience가 카운팅되고나면
	// getGrade에서 값이 쓰일수 있을거같다.
	public void setTotalScore(int score) {
		this.audience++;
		this.totalScore += score;
		this.grade = String.valueOf(this.totalScore / this.audience);
	}

	// 1-2) 평점을 구하는 기능

	// 평점, String타입,반환 숫자를 입력받음, 관객에게.
	// 관객 1명당 점수만 입력받음(1~5점만.). 총점에는 입력받음 점수를 계속더하고
	// int 평점(별점)은 총점/관객수
	// 그 나온 평점을 1.0~1.9(=1) = ☆, 2.0~2.9=☆☆ 이런식으로
	// 해서 String으로 반환.
	public String getGrade() {
		if (Integer.parseInt(this.grade) == 1) {
			return "☆";
		} else if (Integer.parseInt(this.grade) == 2) {
			return "☆☆";
		} else if (Integer.parseInt(this.grade) == 3) {
			return "☆☆☆";
		} else if (Integer.parseInt(this.grade) == 4) {
			return "☆☆☆☆";
		} else if (Integer.parseInt(this.grade) == 5) {
			return "☆☆☆☆☆";
		} else {
			return "\"평가 준비 중입니다.\"";
		}
	}

	public void setGrade() {
		this.grade = grade;
	}

	// 1-3) 정보를 출력하는 추상메소드
	public abstract void getInformation();

}
