package inheritances;

public class Friend1 {
	String name;
	String number;
	
	public Friend1 (String name, String number){
		this.name = name;
		this.number = number;
		
	}

	@Override
	public String toString() {
		return "Friend1 [name=" + name + ", number=" + number + "]";
	}
	
}
	
	