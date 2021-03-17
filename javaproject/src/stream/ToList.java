package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import inheritances.Employee;

public class ToList {
	public static void main(String[] args) {
		
	
	List<String> list = Arrays.asList("Hong","Hwang","Park");
	//stream중간처리 최종집계한 결과를 다시 List<String>
	Collector<String, ?, Set<String>> col = Collectors.toSet();
	
	Set<Object> newList = list.stream()//stream<String>
			.filter(s ->s.startsWith("H"))
			.collect(col);
	
//	for(String str : newList) {
//		System.out.println(str);
//	}
//	
	System.out.println("===========================================");
	EmpDAO dao = new EmpDAO();
	Set<Employee>emps = dao.getEmpList();
	Stream<Employee> empList = emps.stream();
	emps.stream()
	.filter(new Predicate<Employee>() {
		@Override
		public boolean test(Employee t) {
			return t.getJobId().equals("IT_PROG");
		}
	})
	.collect(Collectors.toList());
	
	((Collection<String>) empList).stream().forEach(s -> System.out.println(s));
	}
}
