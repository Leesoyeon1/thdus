package references;

public class ArrayExample {
	public static void main(String[] args) {
		int score1 = 90;
		int score2 = 91;
		int score3 = 92;
		int score4 = 93;
		int score5 = 94;

		int sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.0;

		int[] scores = new int[5];
		scores[0] = 90;// 첫번째 위치에 90이라는 값을 담음(대입연산자)
		scores[1] = 91;// 값을 할당하는 방식
		scores[2] = 91;
		scores[3] = 91;
		scores[4] = 91;
		System.out.println(scores[0]);// 값을 읽어오는 방식
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		scores[0] = 80;
		scores[1] = 81;
		System.out.println("변경후");
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println("-------for---------");
		sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(scores[i]);
			sum = sum + scores[i];
		}
		avg = sum / 5.0;

		int[] scores2 = { 90, 91, 92, 93, 94 };// 인덱스 값을 읽어오거나 불러올수 있다.
		System.out.println(scores2[3]);
		System.out.println(scores2[4]);

		double[] averages = { 1, 2, 3, 4, 5 };// double타입 배열 변수 ,for 반복문과 쓰면 편하다.
		System.out.println(averages.length);
		double d1 = averages[0];
		averages[3] = 4.5;
		for (int i = 0; i < averages.length; i++) {// averages의 배열의 크기
		System.out.println(averages[i]);
		}
		String[] strs = {"Hello","good","Nice", "20"};//동일한 타입만 출력가능
		for(int i = 0; i < strs.length; i++) {
		System.out.println(strs[i]);	
		}
		}
		
		
	}


