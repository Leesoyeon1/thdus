package stream;

import java.util.Arrays;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");

		names.stream().distinct()// 중복제거
				.forEach(n -> System.out.println(n));
		System.out.println();

		names.stream()//필터링
		.filter(n -> n.startsWith("신"))
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()//중복제거 후 필터링
		.distinct()
		.filter(n -> n.startsWith("신"))
		.forEach(n -> System.out.println(n));
	}
}
