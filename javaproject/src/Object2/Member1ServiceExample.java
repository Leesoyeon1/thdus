package Object2;

public class Member1ServiceExample {
	public static void main(String[] args) {
		Member1Service member1Service = new Member1Service();
		boolean result = member1Service.login("hong", "12345");
		if (result) {
			System.out.println("로그인 되셨습니다.");
			member1Service.logout("hong");

		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
