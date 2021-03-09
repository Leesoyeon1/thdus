package exeception;

public class NullPointerExceptionnExample {
	public static void main(String[] args) {
		String data = null;//data는 null값을 가지고 있기 때문에 String객체를 참조하고 있지 않다.
		System.out.println(data.toString());//String객체의 toString() 메소드를 호출-nullpointerexception발생
	}

}
