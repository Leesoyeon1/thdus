package inheritances;

public class SchoolFriend extends Friend1{
	
	String school;
	
	public SchoolFriend(String name, String number, String school) {
		super(name,number);
		this.school=school;
		
	}

	@Override
	public String toString() {
		return "SchoolFriend [school=" + school + ", name=" + name + ", number=" + number + "]";
	}
	
	
	

}
