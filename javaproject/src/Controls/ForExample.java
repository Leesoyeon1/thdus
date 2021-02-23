package Controls;

public class ForExample {
	public static void main(String[] args) {

		// 1~10 까지 합계
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum =sum +i;
			System.out.println("짝수의 합 "+ sum);//짝수만 합계
			}
			

}
	}
}
