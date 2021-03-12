package generics;

class Tv{
	
}

class Car{
	
}



public class ProductExample {
	
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv,String>();
		product1.setkind(new Tv());
		product1.setModel("스마트TV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String>product2 = new Product<Car, String>();
		product2.setkind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}

}
