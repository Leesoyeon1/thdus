package zzz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exam04 {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 80, 40),//
				new Student("신용권", 50, 40),//
				new Student("유미선", 30, 40));

		Stream<Student> stream = studentList.stream();
		studentList.stream()
		.filter(s -> (s.getEng() + s.getMath()) < 100)
		.forEach(s-> System.out.println("이름:"+s.getName()//
				+" 영어 :"+s.getEng()//
				+" 수학:"+s.getMath()));

	}

}
