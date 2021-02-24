package Controls;

public class Morning0225 {
	public static void main(String[] args) {
		// 11부터 30까지의 수의 합을 구하도록 for 반복문
		// 11과 30을 변수로 입력 받아서 합을 구하는 for 반복문
		// 11과 30을 매개변수로 받아서 합을 구하는 메소드
		
	
		System.out.println(getSum(11,30));
	}

	public static int getSum(int fromValue, int toValue) {
		
		int sum = 0;
	
		for (int n1 = fromValue; n1<=toValue; n1++) {
			sum += n1;
		}
		return sum;
	}

}
