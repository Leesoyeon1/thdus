package stream;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum;

	public static void main(String[] args) {
		IntStream is = IntStream.range(15, 35);
		is = IntStream.rangeClosed(15, 35);
		int sum =is.sum();
		System.out.println("총합: " + sum);
//		is.forEach(v -> System.out.println(v));
		// 15~35까지 합?
	}

}
