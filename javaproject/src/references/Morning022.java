package references;

public class Morning022 {
	public static void main(String[] args) {

		// 임성원 점수 88
		// 정준영 점수 89
		// 도왕락 점수 90
		String[] names = { "임성원", "정준영", "도왕락" };
		int[] scores = { 88, 89, 90 };
		
		for( int i = 0; i < 3; i++) {
			
		}
		
		
		for (String name : names) {

			System.out.println(name);
			
		}
		
		int sum = 0;
		for( int score : scores) {
			sum = sum + score;
		}
		System.out.println("합계점수:" + sum);
	}

	public static void arrayCopy() {

	}

	public static void morning0226() {

	}
}
