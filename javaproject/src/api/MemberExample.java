package api;

public class MemberExample {
	public static void main(String[] args) {
		Member original = new Member("홍길동", 25, new int[] {90,90}, new Car("소나타"));
		
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println("복제");
//		Member obj1 = new Member("blue");
//		Member obj2 = new Member("blue");
//		Member obj3 = new Member("red");
//
//		if (obj1.equals(obj2)) {//매개값이 Member타입이고 id필드값도 동일하므로 true
//			System.out.println("obj1과 obj2는 동등합니다.");
//
//		} else {
//			System.out.println("obj1과 obj2는 동등하지 않습니다.");
//		}
//
//		if (obj1.equals(obj3)) {//
//			System.out.println("obj1과 obj3은 동등합니다.");
//
//		} else {
//			System.out.println("obj1과 obj3은 동등하지 않습니다.");
//		}
	}
}
