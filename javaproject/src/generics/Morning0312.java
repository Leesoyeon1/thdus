package generics;

public class Morning0312 {// 기호를 지우는 코드
	private static String checkGender;

	public static void main(String[] args) {

		System.out.println(checkGender("0112233456678"));
		System.out.println(checkGender("011223-4456678"));
		System.out.println(checkGender("011223*4456678"));
		System.out.println(checkGender("950101/1234567"));

		// 두수의 합을 구하고 합의 결과를 3자리 단위로,4,530,890 보여주는 메소드
//		sum("10000",23400);

	}

	public static void sum(String a, String b) {
		System.out.println("3,340");
	}

	public static String checkGender(String j) {
		String[] rep = { "/", "-", "*", "=" };// 기호들은 str

		String r = j;
		for (String str : rep) {
			r = r.replace(str, "");
		}

//	char gender = checkGender.charAt(7);
		if (r.charAt(6) == 1 || r.charAt(6) == 3) {
			System.out.println("남자");
		} else if (r.charAt(6) == 2 || r.charAt(6) == 4) {
			System.out.println("여자");

		}
		return r;

	}
}
