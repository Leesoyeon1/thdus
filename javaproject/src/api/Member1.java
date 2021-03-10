package api;

public class Member1 {
	public String id;
	public  Member1(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member1) {//매개값이 Member1타입인지 확인
			Member1 member1 = (Member1)obj;//Member1타입으로 강제 타입변환하고 id필드값이 동일한지 검사한 후, 동일하다면 true를 리턴
			
			if(id.equals(member1.id)) {
				return true;
			}
		}
		return false;//매개값이member1타입이 아니거나 id필드값이 다른경우 false를 리턴
	}

}
