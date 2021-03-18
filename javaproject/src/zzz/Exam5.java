package zzz;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exam5 {
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee(01,"홍길동","14-09-08","a",5000),//
				new Employee(02,"신용권","15-04-07","a",3400),//
				new Employee(03,"유미선","18-05-02","a",2500),//
				new Employee(04,"김미나","17-07-17","a",3800));

				Stream<Employee> stream = employeeList.stream();
				employeeList.stream()
				.mapToInt(Employee::getSalary)
				.filter(s -> (s.getSalary())
				.average()
				.getAsDouble());
				System.out.println("전체평균급여: +avg");
			}

}
