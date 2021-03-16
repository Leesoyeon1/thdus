package stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Practice.SumAvg;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strAry = { "Hong", "Hwang", " Kim", "Park" };
		Stream<String> stream = Arrays.stream(strAry);

		int[] intAry = { 3, 8, 9, 5, 4 };
		IntStream intStream = IntStream.of(intAry);
		intStream = Arrays.stream(intAry);

		intStream = Arrays.stream(intAry);
		OptionalDouble od = intStream.filter(new IntPredicate() {
			@Override
			public boolean test(int value) {

				return value % 2 == 0;
			}
		}).average();

		int sum = 0;
		for (int a : intAry) {
			if (a % 2 == 0)
				sum += a;

		}
		System.out.println("합계는 : " + sum);
	}

}
