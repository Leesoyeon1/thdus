package generics;


public class BoxExample {
	public static void main(String[] args) {
		String str = new String("apple");
		Apple apple = new Apple();
		Orange orange = new Orange();
		
		Box box = new Box();
		box.setBox(apple);
		
		Box<Orange> orangeBox = new Box<Oranage>()
 		
		String newStr = (String)box.getBox();
		Apple newApple = (Apple)box.getBox();
		Orange neworange = (Orange)box.getBox();
	}

}
