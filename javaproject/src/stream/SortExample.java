package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortExample {
	public static void main(String[] args) {
		int[] intAry = { 5, 3, 2, 1, 4 };
		IntStream is = Arrays.stream(intAry);
		is.sorted().forEach(number -> System.out.println(number));

		Student[] stdArray = { new Student("Hong", 10)//
				, new Student("Shin", 20)//
				, new Student("Yu", 30) };
		Stream<Student> st = Arrays.stream(stdArray);
		st.sorted().forEach(s -> System.out.println(s.getName()));
	
	//Hong,30 - Shin,20 양의값	
	//Yu,15 - Shin,20 음의값
		
	}
}
