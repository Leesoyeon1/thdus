package references;

import java.util.Scanner;

public class Morning0226 {
	public static void main(String[] args) {
		//int 영어점수 담을 수 있는 engScores =>3
		//int 수학점수 담을 수 있는 mathScores =>3
		
		//영어, 수학 성적 입력
		//영어의 평균점수, 수학의 평균을 구하는 코딩
		//출력형태 -> 영어평균 85.5 / 수학평균 88.7
		
		int engScores[] = new int[3];
		int mathScores[] = new int[3];
		int sum = 0;
		double engAvg = 0;
		double mathAvg = 0;
		Scanner scn = new Scanner(System.in);
		
		for (int a  =0; a<engScores.length; a++) {
			System.out.println("영어점수>");
			engScores[a]= scn.nextInt();
			sum += engScores[a];
		}
		
		engAvg = (double)sum / engScores.length;
		sum = 0;
		
		for(int i =0; i<mathScores.length; i++) {
			System.out.println("수학점수>");
			engScores[i]= scn.nextInt();
			sum += mathScores[i];
			
}
		mathAvg = (double)sum / mathScores.length;
		System.out.println("영어평균은"+ engAvg);
		System.out.println("수학평균은"+ mathAvg);
		
		
			
		}
	
	}
