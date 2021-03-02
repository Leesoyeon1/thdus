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

			if (menu == 1) {
				if (studentCount != 0) {
					System.out.println("이미 입력했습니다.");

					continue;
				}
				System.out.print("학생수> ");
				studentCount = scn.nextInt();
				students = new int[studentCount][3];

			}

			if (menu == 2) {
				for (int i = 0; i < students.length; i++) {
					System.out.println("학생번호> ");
					students[i][0] = scn.nextInt();
					System.out.println("영어점수> ");
					students[i][1] = scn.nextInt();
					System.out.println("수학점수> ");
					students[i][2] = scn.nextInt();

				}
			} else if (menu == 3) {
				for (int i = 0; i < students.length; i++) {
					System.out.println("학생번호>" + students[i][0]);
					System.out.println("영어점수 :" + students[i][1]);
					System.out.println("수학점수:" + students[i][2]);

				}
			} else if (menu == 4) {

				System.out.println("학생번호>");
				int ans = scn.nextInt();

				for (int i = 0; i < students.length; i++) {
					if (students[i][0] == ans) {
						System.out.println("영어점수 :" + students[i][1]);
						System.out.println("수학점수:" + students[i][2]);
						System.out.println("합계 :" + (students[i][1] + students[i][2]));
						System.out.println("평균 :" + (students[i][1] + students[i][2]) / 2.0);
					}

				}
			} else if (menu == 5) {

				int maxValue = 0;
				int engTop = 0;
				for (int i = 0; i < students.length; i++) {

					if (students[i][1] > maxValue) {
						maxValue = students[i][1];
						engTop=i;
						

					}
					
				}System.out.println("영어최고점>" + maxValue + "학생번호: " + students[engTop][0]);
				
			} else if (menu == 6) {
				int sumMax = 0;
				int sum = 0;
				int top = 0;

				for (int i = 0; i < students.length; i++) {
					sum += (students[i][1] + students[i][2]);

					if (sum > sumMax) {
						sumMax = (sum);
						top = i;
					}
					sum = 0;

				}
				System.out.println("합계최고점수 학생: " + students[top][0] + "평균점수 :" + sumMax / 2.0);

			} else if (menu == 7) {

				double mathAvg;
				int mathSum = 0;

				for (int i = 0; i < students.length; i++) {
					mathSum = mathSum + students[i][2];
				}
				mathAvg = (double) mathSum / students.length;
				System.out.println("수학의 평균:" + mathAvg);
				for (int i = 0; i < students.length; i++)
					if (mathAvg < students[i][2]) {
						System.out.println("수학 평균 이상인 학생>" + students[i][0] + "수학점수: " + students[i][2]);

					}
			} else if (menu == 9) {
				break;

			}

		}
		System.out.println("프로그램 종료");

	}

}
