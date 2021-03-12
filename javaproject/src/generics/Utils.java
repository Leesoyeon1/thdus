package generics;

import oracle.net.aso.k;

public class Utils {// 제네릭 메소드로 boxing()을 정의함
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

public static<k,V> boolean compare(Pair<k,V>p1, Pair<K,V>p2) {
	boolean keyValue = p1.getKey().equals(p2.getKey());//타입을 제한
	boolean valValue = p1.getValue().equals(p2.getValue());
	return keyValue && valValue;
}

	public static <T> int compare(T t1, T t2) {
		return 0;
	}
}
