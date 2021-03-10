package api;

public class Member1Example {
	public static void main(String[] args) {
		Member1 obj1 = new Member1("blue");
		Member1 obj2 = new Member1("blue");
		Member1 obj3 = new Member1("red");

		if (obj1.equals(obj2)) {// 매개값이 Member1타입이고 id필드값도 동일하므로 true
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

		if (obj1.equals(obj3)) {//매개값은 Member1타입이지만 id필드값이 다르므로 false
			System.out.println("obj1과obj3은 동등합니다.");
		} else {
			System.out.println("obj1과obj3은 동등하지 않습니다.");
		}
	}

}
