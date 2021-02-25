package Controls;

public class Exercise06 {
	public static void main(String[] args) {
		// 임의의 값 두수를 35,60
		// 35~60까지의 합을 구하는 프로그램 생성
		// 44,67
		// 결과 =getSumValue(44,67);
		// 두수사이의 합계:???

		int sNum = 44;
		int eNum = 67;
		int sum = getSumValue(sNum, eNum);
		
		System.out.println(sNum + "과 " + eNum + "합:" + sum);

	}

	public static int getSumValue(int n1, int n2) {
		//정수1,정수2 사이의 합을 구하는 메소드
		int sum = 0;
		int i = 0;
		for (i = n1; i <= n2; i++) {
			sum = sum + 1;

		}
		return sum;
		
//		int startNo = (n1>n2)? n2: n1;
//		int endNo = (n2>n1)? n1: n2;
//		int sum = 0;

	}
}
