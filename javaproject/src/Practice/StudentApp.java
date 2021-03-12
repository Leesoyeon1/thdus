package Practice;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {

		Student[] stu = new Student[100];
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1.학생등록 2.수정 3.삭제 4.조회 5.종료 ");
			System.out.println("------------------------------------");
			System.out.println("선택>");
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				

				System.out.println("학생등록");
				System.out.println("학번");
				int number = scn.nextInt();
				scn.nextLine();
				System.out.println("이름");
				String name = scn.nextLine();
				System.out.println("나이");
				int age = scn.nextInt();
				scn.nextLine();
				System.out.println("연락처");
				String phone = scn.nextLine();

				for(int i = 0; i < stu.length; i++) {
					if(stu[i]==null) {
						stu[i] = new Student(number,name,age,phone);
					}
				}
			}

			else if (menu == 2) {
				System.out.println("학번입력");
				int number = scn.nextInt();
				scn.nextLine();
				for(int i = 0; i<stu.length; i++) {
					if(stu[i]!=null && stu[i].getNumber()==number) {
						System.out.println("연락처 수정");
						String phone = scn.nextLine();
						stu[i].setPhone(phone);
						System.out.println("수정이 완료되었습니다.");
					}
				}
				

			} else if (menu == 3) {

			} else if (menu == 4) {

				System.out.println("학번>");
				int num = scn.nextInt();
				System.out.println();

			} else if (menu == 5) {

				int maxValue = 0;
				int engTop = 0;
				for (int i = 0; i < students.length; i++) {

					if (students[i][1] > maxValue) {
						maxValue = students[i][1];
						engTop = i;

					}

				}

				System.out.println("영어최고점>" + maxValue + "학생번호: " + students[engTop][0]);

			}
		}
	}
}
