package Object2;

public class Member1Service {
	boolean login(String id, String password) {
		if (id == "hong" && password == "12345")
			return true;
		else
			return false;
	}

	void logout(String id) {
		if (id == "hong") {
			System.out.println("로그아웃 되셨습니다.");
		}
	}
}
