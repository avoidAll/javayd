package com.home.java.hw221111.Question3;

public class Performance extends Culture {
	// field
	public String genre;

	// constructor

	// method
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	// 3-1) 제목, 참여감독 수, 참여배우 수, 관객 수, 총점, 평점을 출력하는 기능
	@Override
	public void getInformation() {
		System.out.println("공연제목 : " + getSubject());
		System.out.println("감독 : " + getDirectors());
		System.out.println("배우 : " + getActors());
		System.out.println("공연총점 : " + getTotalScore());
		System.out.println("공연평점 : " + getGrade());
	}

}
