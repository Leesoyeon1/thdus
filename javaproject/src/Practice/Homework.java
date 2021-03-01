package Practice;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] students = null;
		int studentNum = 0;// 학생번호
		int studentCount = 0;// 학생수

		while (true) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계최고 7.수학평균이상 9.종료");
			System.out.println("------------------------------------------------------------------");
			System.out.println("선택 >");
			int menu = scn.nextInt();
			if (menu != 1 && students == null) {
				System.out.println("이미 입력했습니다.");
				System.out.println();
				continue;
			}

			if (menu == 1) {
				System.out.print("학생수> ");
				studentCount = scn.nextInt();
				students = new int[studentCount][];

			} else if (menu == 2) {
				for (int i = 0; i < students.length; i++) {
					System.out.println("학생번호> ");
					
					System.out.println("영어점수> ");
					students[i][1] = scn.nextInt();
					System.out.println("수학점수> ");
					students[i][2] = scn.nextInt();

				}
			} else if (menu == 3) {
				for (int i = 0; i < students.length; i++) {
					System.out.println("학생번호>"+students[i]);
					studentNum = scn.nextInt();

				}
			}

		}

	}
}
