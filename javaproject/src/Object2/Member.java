package Object2;

public class Member {

	private String memberId;
	private String memberName;
	private Book[] rentBooks = new Book[3];
	public Member() {}

	public Member(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}

		}
	}

	public void overdue(Book book) {// 똑같은 제목의 책을 지우겠다는 뜻
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getName().equals(book.getName())) {
				rentBooks[i] = null;
				break;
			}

		}
	}

	public String getBookInfo() {
		String result = "";//result값을 초기화 string
		result = memberName;//result에 memberName을 대입
		for (int i = 0; i < rentBooks.length; i++) {//책의 길이만큼 출력
			if (rentBooks[i] != null) {//rentBooks가 null값이 아니면 출력하겠다.
				result +="/"+ rentBooks[i].getName();
			}
		}
		return result;
	}
}
