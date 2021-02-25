package references;

public class ArrayExample2 {
	public static void main(String[] args) {

		// math.random () 1부터 100까지 숫자
		// 10개담기
		// sum 합한값
		// 짝수값만 합하기
		// if 안에다가 count 변수선언

		int[] arr1 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 100 + 1);
			System.out.println(arr1[i]);
		}

//		int sum = 0;
//		int count = 0;
//
//		for (int n1 = 1; n1 <= 100; n1++) {
//			if (arr1[n1] % 2 == 0) {
//				sum = sum + arr1[n1];
//				count++;
//			}
//
//		}
//		System.out.println("짝수의 합:" + sum + "평균: "+ (double)sum/count);

	}
	
}