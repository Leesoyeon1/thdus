package Controls;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);// ctrl+shift+o
		
		while (run) {
			
			System.out.println("-----------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-----------------");
			
			int menu = scn.nextInt();// int타입으로 반환(숫자값을 불러옴)
			
			if (menu == 1) {// 예금가능
				System.out.println("입금액을 입력>>");
				balance = balance + scn.nextInt();//사용자 입력금액

			} else if (menu == 2) {// 출금기능
				System.out.println("출금액을 입력>>");
				balance = balance - scn.nextInt();
				
			} else if (menu == 3) {//잔고기능
				System.out.println("잔액은 " + balance);
				
			} else if (menu == 4) {//반복문 종료
				
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		
		
	}
	
	
	
}
