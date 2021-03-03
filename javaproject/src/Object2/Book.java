package Object2;

public class Book {
		
	
	private String name;// 책제목
	private String person;// 책저자
	private String company;// 출판사
	private int price;// 금액

	public Book() {

	}

	public Book(String name, String person, String company, int price) {
		this.name = name;
		this.person = person;
		this.company = company;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
