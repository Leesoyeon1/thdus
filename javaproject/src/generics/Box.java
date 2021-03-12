package generics;

class Apple{
	int price;
	String kind;
	
	Apple(int price, String kind){
		this.price = price;
		this.kind = kind;
	}
	@Override
	public boolean equals(Object obj) {
		Apple a = (Apple) obj;
		return this.price == a.price;
	}
	
}
class Orange{
	int price;
	String kind;
	
	Orange(int price, String kind){
		this.price = price;
		this.kind = kind;
	}
	@Override
	public boolean equals(Object obj) {
		Orange o = (Orange) obj;
		return this.price == o.price;
	}
	
	
}

public class Box {
	Object box;
	public void setBox(Objext box) {
		this.box = box;
		
	}
	public String getBox() {
		return box;
	}

}
