package api;

import java.util.Arrays;

public class Member implements Cloneable {

	public String name;
	public int age;
	public int[] scores;
	public Car car;

	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone();
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);

		return cloned;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();

		}
		return cloned;
	}
//	public String id;
//
//	public Member(String id) {
//		this.id = id;
//		
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Member) {//매개값이 Member타입인지 확인
//			Member member = (Member) obj;//Member타입으로 강제 타입변환하고 id필드값이 동일한지 검사한 후, 동일하다면 true를 리턴
//			if (id.equals(member.id)) {
//				return true;
//			}
//
//		}
//		return false;//매개값이 Member타입이 아니거나 id필드값이 다른 경우 false를 리턴
//	}

}
