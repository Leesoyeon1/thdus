package inheritances;

public class CompanyFriend extends Friend1{
	String company;

	public CompanyFriend(String company, String name, String number) {
		super(name, number);
		this.company = company;
		
	}

	@Override
	public String toString() {
		return "CompanyFriend [company=" + company + ", name=" + name + ", number=" + number + "]";
	}
	

}
