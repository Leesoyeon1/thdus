package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class StreamPipeExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(//
				new Member("Hong", Member.MALE, 30), //
				new Member("Kim", Member.FEMALE, 20), //
				new Member("Shin", Member.MALE, 46), //
				new Member("Park", Member.FEMALE, 27)//
		);
		Stream<Member> result = list.stream();// Stream<Member>
		result.filter(new Predicate<Member>() {// 중간처리메소드
			@Override
			public boolean test(Member t) {
				return t.getSex() == Member.MALE;
			}
		}).mapToInt(new ToIntFunction<Member>() {
			@Override
			public int applyAsInt(Member t) {
				return t.getAge();
			}
		}).average()// OptionalDouble -> 최종처리메소드
		;
		System.out.println("남자평균 나이: " + result.getAsDouble());

		list.stream().mapToInt(new ToIntFunction() {
			@Override
			public int applyAsInt(Member t) {
				return t.getAge();
			}

		}).filter(new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value > 50;
			}
		}).average();
		System.out.println(result.orElse(0, 0));

//		if(result.isPresent()) {
//			System.out.println("평균 : " + result.getAsDouble());
//		}else {
//			System.out.println("반복하는 요소가 없습니다.");
//		}
//	
//	

	}
}
