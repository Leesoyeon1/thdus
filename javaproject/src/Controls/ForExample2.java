package Controls;

public class ForExample2 {
	public static void main(String[] args) {
		
//		System.out.println(num + " * " + 1 + "=" + (num * 1));
//		System.out.println(num + " * " + 2 + "=" + (num * 1));
//		System.out.println(num + " * " + 3 + "=" + (num * 1));
//		System.out.println(num + " * " + 4 + "=" + (num * 1));
//		System.out.println(num + " * " + 5 + "=" + (num * 1));
//		System.out.println(num + " * " + 6 + "=" + (num * 1));
//		System.out.println(num + " * " + 7 + "=" + (num * 1));
//		System.out.println(num + " * " + 8 + "=" + (num * 1));
//		System.out.println(num + " * " + 9 + "=" + (num * 1));
//		
		
		for(int i=2; i<=9; i++) {
			showResult(i);
		}
	}//end of main
	public static void showResult(int num) {
		for (int i = 1; i<=9; i++) {
			System.out.println(num + " * "+ i +" =" + (num *i));
		}
	}//end of showResult

}
