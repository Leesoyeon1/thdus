package Practice;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] students = null;
		int studentNum = 0;// �л���ȣ
		int studentCount = 0;// �л���

		while (true) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("1.�л��� 2.�����Է� 3.����Ʈ 4.��ȸ 5.�����ְ��� 6.�հ��ְ� 7.��������̻� 9.����");
			System.out.println("------------------------------------------------------------------");
			System.out.println("���� >");
			int menu = scn.nextInt();
			if (menu != 1 && students == null) {
				System.out.println("�̹� �Է��߽��ϴ�.");
				System.out.println();
				continue;
			}

			if (menu == 1) {
				System.out.print("�л���> ");
				studentCount = scn.nextInt();
				students = new int[studentCount][];

			} else if (menu == 2) {
				for (int i = 0; i < students.length; i++) {
					System.out.println("�л���ȣ> ");
					
					System.out.println("��������> ");
					students[i][1] = scn.nextInt();
					System.out.println("��������> ");
					students[i][2] = scn.nextInt();

				}
			} else if (menu == 3) {
				for (int i = 0; i < students.length; i++) {
					System.out.println("�л���ȣ>"+students[i]);
					studentNum = scn.nextInt();

				}
			}

		}

	}
}
