package Object2;

public class Calculator {
	double pi = 3.14;
	
	public double getArea(double radius) {
		double result = pi * radius * radius;
		return result;//static이 없으면 instance가 있어야 사용가능
		
	}
	public static double getRect(double d1, double d2) {//static이 있으calculator가 사용되는 시점에 이미 준비가 됨 
		double result = d1*d2;
		return result;
		
	}

}
