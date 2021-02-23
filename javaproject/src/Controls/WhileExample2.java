package Controls;

public class WhileExample2 {
	public static void main(String[] args) {
		// 구구단 출력하기(while 구문사용)

		for(int a=2;a<=9;a++) {
			multi(a);
		}

	} 
	public static void multi(int stage) {
		int a= 1;
		while (a<=9) {
			System.out.println(stage+ "*"+ a + "="+(stage*a));
			a++;
		}
	}
}
