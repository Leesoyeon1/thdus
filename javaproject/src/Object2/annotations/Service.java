package Object2.annotations;

public class Service {
	@PrintAnnotation()
	String name;
	
	@PrintAnnotation(value = "*")
	public void method1() {
		
	}
	
	@PrintAnnotation(value = "*", number = 20)
	public void method2() {
		
	}
	
	@PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("실행내용3");
	}

}
