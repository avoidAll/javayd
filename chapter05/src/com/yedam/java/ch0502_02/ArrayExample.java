package com.yedam.java.ch0502_02;

public class ArrayExample {
	public static void main(String[] args) {

		int[][] mathScores = new int[2][3];

		// 첫번째: 변수 사용
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");
			int[] mathScore = mathScores[i];
//			System.out.println(mathScore);
			for (int j = 0; j < mathScore.length; j++) {
				System.out.println("\t mathScore[" + j + "] : " + mathScore[j]);
			}
		}

		System.out.println();
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println();

		// 나으 이해 방법
		// = int[][] mathScores = new int[i][j];
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println((i + 1) + "번째 출력");
			int[] mathScore = mathScores[i];
//			System.out.println(mathScore);
			for (int j = 0; j < mathScore.length; j++) {
				System.out.println("\t 위 " + (i + 1) + "번째 줄의 " + (j + 1) + "번째 칸 출력 : " + mathScore[j]);
			}
		}

		System.out.println();
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println();

		// 두번째 : 변수 사용 X
		for (int i = 0; i < mathScores.length; i++) {
			System.out.println("mathScores[" + i + "]");

			// An understanding of "mathScores[i].length" is required.
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.println("\t mathScores[" + i + "][" + j + "] : " + mathScores[i][j]);
			}
		}
		System.out.println();
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println();

		int[][] scoreList = { { 86, 65 }, { 58, 95, 73 } };

		for (int i = 0; i < scoreList.length; i++) {
			System.out.println(i + "번째 학생 석적 ====");
			for (int j = 0; j < scoreList[i].length; j++) {
				System.out.print("\t" + scoreList[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println();

		int[][] englishScore = new int[2][];
		englishScore[0] = new int[3];
		englishScore[1] = new int[2];

		for (int i = 0; i < englishScore.length; i++) {
			for (int j = 0; j < englishScore[i].length; j++) {
				System.out.println("englishScore[" + i + "][" + j + "] : " + englishScore[i][j]);
			}
		}

		System.out.println();
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println();

		//
		String[] strArray = new String[3]; // String은 변수가 값을 가지고 있는게 아님
		// heap영역에 있는 값을 찾아감
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]); // 값이 같은지를 확인하는 과정
		System.out.println(strArray[1] == strArray[2]); //
		// 객체를 비교할땐 (==) 등호연산자를 쓰면 안됨 :: 참조하는 주소값을 비교하기 때문
		// 객체에서 입력되어있는 값은 값을 저장하고있는 객체에 대해서, 참조할 그 주소값임
		// 객체의 값을 비교하고자 한다면 .equals()를 써야함
		System.out.println(strArray[1].equals(strArray[2]));

		System.out.println();
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println();

		// for문으로 배열 복사
		// 작은 그릇에 있다가 큰 그릇으로 옮긴다?
		int[] oldIntAry = { 1, 2, 3 };
		int[] newIntAry = new int[5];
		// oldIntAry에 있는 값을 newIntAry에 옮겨보자
//		System.out.println(oldIntAry.length);
		for (int i = 0; i < oldIntAry.length; i++) {
			newIntAry[i] = oldIntAry[i];
		}

		for (int i = 0; i < newIntAry.length; i++) {
			System.out.println(newIntAry[i]);
		}

		System.out.println();
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println();

		// System.arraycopy()
		String[] oldStrAry = { "java", "array", "copy" };
		String[] newStrAry = new String[5];

		System.arraycopy(oldStrAry, 0, newStrAry, 1, oldStrAry.length);
		System.out.println(newStrAry);
		for (int i = 0; i < newStrAry.length; i++) {
			System.out.println(newStrAry[i]);
		}

		System.out.println();
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println();

		// 향상된 for문
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		int index = -1;
		for (int score : scores) {
			sum += score;
			System.out.println("인덱스 : " + ++index);
		}
		System.out.println("점수 총 합계 : " + sum );
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 총합의 평균 : " + avg);

		
		
		
		
		
		
		
		
	}
}
