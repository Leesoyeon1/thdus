package Threads;



public class MainThreadExample {
	public MainThreadExample() {
	
		Calculator claculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(claculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(claculator);
		user2.start();
	}

}
