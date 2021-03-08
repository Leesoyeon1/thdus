package abstractClasses;

public class AnimalExample {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal animal = new Bird("조류");
		animal.breathe();
		animal.sound();
		
		animal = new Cat("포유류");
		animal.breathe();
		animal.sound();
	}

}
