package generics;

public class CompareMethodExample {
	public static void main(String[] args) {
//		Utils u = new Utils();
		Pair<Integer, String>p1 = new Pair<Integer,String>(1,"사과");
		Pair<Integer, String>p2 = new Pair<Integer,String>(1,"사과");
		
		boolean result = Util.compare(p1,p2);
		if(result) {
			System.out.println("논리적 동등");
		}else {
			System.out.println("논리적 다름");
		}
	}

}
