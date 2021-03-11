package Threads;

public class User2 {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
		
	
		
	}
	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void run() {
		calculator.setMemory(50);
	}
	
}
