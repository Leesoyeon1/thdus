package Object2;

import java.util.Scanner;

public class BankApplication {
	private static Account1[] accountArray = new Account1[100];
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("--------------------------------------");
			System.out.println("선택>");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				createAccount();

			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("계좌번호 : ");
		String ano = scn.nextLine();
		System.out.println("계좌주 : ");
		String owner = scn.nextLine();
		System.out.println("초기입금액");
		int balance = scn.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account1(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}

	}

	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}

			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());

		}

	}

	private static void deposit() {
		System.out.println("------------");
		System.out.println("예금");
		System.out.println("------------");
		System.out.println("계좌 번호");
		String ano = scn.nextLine();
		
		for (int i= 0; i < accountArray.length; i++) {
			
		}
			
	}

	private static void withdraw() {

	}
	
	private static Account findAccount(String ano) {
		int a =0;
		for (int i =0; i< accountArray.length; i++) {
			if( ano.equals(accountArray[i].getAno())) {
				
				
				
				
				
				
				
				
			}
		}
		return null;
			
		
	}
}
