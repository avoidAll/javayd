package com.home.java.hw221111.question3;

import java.util.Scanner;

// 등록관리자

public class CultureManager {
	Scanner sc = new Scanner(System.in);
	boolean run = true; // 실행
	Culture[][] culture = null;
	int menuNo;

	public CultureManager() {

		while (run) {
			showMenu();
			System.out.print("\n\tchoose an action : ");
			menuNo = Integer.parseInt(sc.nextLine());

			switch (menuNo) {
			case 1:
				setSize();
				break;
			case 2:
				break;
			case 3:
				lookupMovie();
				break;
			case 4:
				break;
			case 5:
				lookupPerformance();
				break;
			case 6:
				run = false;
				System.out.println(" 프로그램 종료 ");
				break;
			case 7:

				break;
			default:
			}
		}
	}

	// 메뉴 호출
	private void showMenu() {
		System.out.println("==================================================================");
		System.out.println("| 1. 영화/공연 정보등록 | 2. 영화/공연 평가하기 | 3. 영화/공연 정보조회 | 4. 종료 |");
		System.out.println("==================================================================");
	}

	// menu 1 : 영화&공연 수
	private void setSize() {
		System.out.println("=====================================");
		System.out.println(" 영화정보 등록은 \"1\" 공연정보 등록은 \"2\" |");
		System.out.println("=====================================");
		System.out.print(" 영화(1) OR 공연(2) ?  >>  ");
		int groupNum = Integer.parseInt(sc.nextLine());
		if (groupNum == 1) {
			System.out.print(" 등록할 영화의 갯수를 입력하세요  >>  ");
			int cultureCount = Integer.parseInt(sc.nextLine());
   
			registerMovie();
		} else if (groupNum == 2) {
			System.out.print(" 등록할 공연의 갯수를 입력하세요  >>  ");
			int cultureCount = Integer.parseInt(sc.nextLine());
			culture[1] = new Performance[cultureCount];
			registerPerformance();
		} else {
			System.out.println(" 메뉴중에 고르세요 / 종료");
			setSize();
		}
	}

	// menu 1-1) : 영화정보 등록
	private void registerMovie() {
		for (int i = 0; i < culture[0].length; i++) {
			Culture movie = new Movie();
			System.out.print(" 영화의 제목 > ");
			String subject = sc.nextLine();
			movie.setSubject(subject);
			System.out.print(" 영화의 장르 > ");
			Movie cMovie = (Movie) movie;
			String genre = sc.nextLine();
			cMovie.setGenre(genre);
			System.out.print(" 참여한 감독 수 > ");
			int directors = Integer.parseInt(sc.nextLine());
			movie.setDirectors(directors);
			System.out.print(" 출연 인물 수 > ");
			int actors = Integer.parseInt(sc.nextLine());
			movie.setActors(actors);

			System.out.println("\t" + (i + 1) + "/" + culture[0].length + "번째 영화정보 입력완료-");
			System.out.println();
			culture[0][i] = movie;
		}
	}

	// menu 1-2) : 공연정보 등록
	private void registerPerformance() {
		for (int i = 0; i < culture[1].length; i++) {
			Culture perform = new Performance();
			System.out.print(" 공연의 제목 > ");
			String subject = sc.nextLine();
			perform.setSubject(subject);
			System.out.print(" 공연의 장르 > ");
			Performance cPerform = (Performance) perform;
			String genre = sc.nextLine();
			cPerform.setGenre(genre);
			System.out.print(" 참여한 감독 수 > ");
			int directors = Integer.parseInt(sc.nextLine());
			perform.setDirectors(directors);
			System.out.print(" 출연 인물 수 > ");
			int actors = Integer.parseInt(sc.nextLine());
			perform.setActors(actors);

			System.out.println("\t" + (i + 1) + "/" + culture[1].length + "번째 공연정보 입력완료-");
			System.out.println();
			culture[1][i] = perform;
		}
	}

	// menu 2)
	private void rate() {
		System.out.println("=====================================");
		System.out.println(" 영화 평가는 \"1\" 공연 평가는 \"2\" |");
		System.out.println("=====================================");
		System.out.print(" 영화(1) OR 공연(2) ?  >>  ");
		int groupNum = Integer.parseInt(sc.nextLine());
		if (groupNum == 1) {
			rateMovie();
		} else if (groupNum == 2) {
			System.out.print(" 등록할 공연의 갯수를 입력하세요  >>  ");
			int cultureCount = Integer.parseInt(sc.nextLine());
			culture[1] = new Performance[cultureCount];
			registerPerformance();
		} else {
			System.out.println(" 메뉴중에 고르세요 / 종료");
			setSize();
		}
	}

	// menu 2-1) : movie 평점주기
	private void rateMovie() {
		for (int i = 0; i < culture[0].length; i++) {
			System.out.println("점수를 매길 영화는 \"" + culture[0][i].getSubject() + "\"입니다.");
			System.out.print(" 해당영화의 점수(1~5)를 매겨주세요 > ");
			int score = Integer.parseInt(sc.nextLine());
			culture[0][i].setTotalScore(score);
			System.out.println("소중한 의견 감사합니다.");
		}
	}

	// menu 3-1) : 영화정보 조회
	private void lookupMovie() {
		for (int i = 0; i < culture[0].length; i++) {
			System.out.println(" 영화들의 정보를 보여드립니다. ");
			culture[0][i].getInformation();
			System.out.println("=======================");
		}
	}

	// menu 5 : 공연정보 조회
	private void lookupPerformance() {

	}
}
