package variables;

public class MethodExample {
	public static void main(String[] args) {

		System.out.println(sum(10, 20));
		System.out.println(minus(30, 20));
		System.out.println(multi(15, 13));
		System.out.println(divide(30, 12));
		printAge(26);

	}

	public static void printAge(int age) {
		System.out.println("나이는 :"+ age + "입니다.");
	}
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int minus(int a1, int b1) {
		int result = a1 - b1;
		return result;

	}

	public static int multi(int a2, int b2) {
		int result = a2 * b2;
		return result;
	}

	public static int divide(int a3, int b3) {
		int result = a3 / b3;
		return result;

	}

}
