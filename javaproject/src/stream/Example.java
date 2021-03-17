package stream;

import java.util.Random;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		

		int[] num = new int[3];// 컴퓨터배열

		int[] array = new int[3];// 유저배열

		int strike = 0;// strike값 0초기화
		int ball = 0;// ball값 0 초기화
		boolean loop =true;
		
		
		
		for( int i = 0; i< num.length; i++) {
			num[i] = (int)(Math.random()*9)+ 1;// 컴퓨터 배열 1~9까지 숫자 랜덤수
			for (int j = 0; j<i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
		}

		Scanner scn = new Scanner(System.in);//유저가 입력받기
		
		

		num[1] = (int)(Math.random()*9)+ 1;// 처음에 뽑은 랜덤수와 뒤에 뽑은 랜덤수가 같으면 다시 뽑는다.
		while (num[0] == num[1]) {
			num[1] = (int)(Math.random()*9) + 1;
		}
		num[2] = (int)(Math.random()*9) + 1;// 랜덤수가 같으면 다시 뽑는다.
		while (num[0] == num[2] || num[1] == num[2]) {
			num[2] = (int)(Math.random()*9) + 1;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i);
		}
		while (true) {
			strike = 0;// 초기화
			ball = 0;

			for (int i = 0; i < array.length; i++) {
				System.out.println((i + 1) + "번째 수를 입력하세요");//배열의 길이만큼 입력받음
				array[i] = scn.nextInt();

			}
			if (array[0] == array[1] || array[1] == array[2] || array[0] == array[2]) {//입력값이 같으면 중복입니다.
				System.out.println("중복입니다.");
				continue;
			}
			for (int i = 0; i < array.length; i++) {//num의 자리수와 array자리수가 같으면 strike, 아니면 ball
				for (int j = 0; j < num.length; j++) {
					if (num[j] == array[i]) {
						strike++;
					} else {
						ball++;
					}
				}

			}
			

		}
	}
}
