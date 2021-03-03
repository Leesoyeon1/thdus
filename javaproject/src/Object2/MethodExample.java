package Object2;

import Object.Student;

public class MethodExample {
	public static void main(String[] args) {
		
		for(int i =0; i <args.length; i++) {
			System.out.println("매개값["+i+"]: " + args[i]);
		}
		
		Calculator.getRect(4.5,2);//static
		
		Calculator cal = new Calculator();
		double result = cal.getArea(3.5);
		
		MethodExample me = new MethodExample();
		me.sum(10,20);
		
		Book b1 = new Book("","","",100);
		Student s1 = new Student(null);
		s1.run();
		s1.study();
	}
	public int sum(int a, int b) {//static이 없으면 instance를 하나 만든다.
		return a+b;
	}

}
