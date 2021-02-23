package Controls;

public class SwitchExample2 {
	public static void main(String[] args) {
		// int num = (int)(Math.random()*6)+1;//int 타입으로 형태변환

		for (int i = 0; i < 5; i++) {
			int A = (int) (Math.random() * 10) + 1;
			System.out.println(A);
		}

		String msg = "짝수/홀수";
		int A = (int) (Math.random() * 10) + 1;
		switch (A) {
		case 1:
			msg = "홀수";
			break;
		case 2:
			msg = "짝수";
			break;
		case 3:
			msg = "홀수";
			break;
		case 4:
			msg = "짝수";
			break;
		case 5:
			msg = "홀수";
			break;
		case 6:
			msg = "짝수";
			break;

		}
		System.out.println(A + "는" + msg + "입니다.");
	}

}
