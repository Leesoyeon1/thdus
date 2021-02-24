package Controls;

import java.util.Scanner;

public class DoWhileExample {
public static void main(String[] args) {
	//System.in.read();
	//scanner.readLine();
	Scanner Scn = new Scanner(System.in);//import java.lang.System;
	System.out.println("값을 입력.");
	String str = Scn.nextLine();//Scn.nextLine();-문자열을 입력받아 리턴
	System.out.println("입력한 값은 : " + str);
	boolean run = true;
	
	do {
		System.out.println(">");
		str = Scn.nextLine();
		System.out.println(">>>" + str);
		if(str.equals("q")) {
			//run = false;
			break;
		}
	}while ( !str.equals("q"));//q가 아니면 무한반복을 실행하겠다는 뜻
	 System.out.println("프로그램 종료.");
}
}
