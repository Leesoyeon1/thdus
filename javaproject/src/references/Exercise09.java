package references;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {

//학생수와 각 학생들의 점수를 입력받아서 최고 점수 및 평균점수를 구하기
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);

		while (run) {

			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 |3.점수리스트 |4. 분석 |5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = scn.nextInt();
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {
				for (int b = 0; b < scores.length; b++) {
					

				}

			}

		}

	}
}
