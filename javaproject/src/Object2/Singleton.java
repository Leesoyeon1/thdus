package Object2;

public class Singleton {
	static Singleton singleton =  new Singleton();
	private Singleton() {}//singleton 이 외부에서 불러올수 없도록
	public static Singleton getInstance() {
		return singleton;
	}
	// TODO Auto-generated constructor stub
}

