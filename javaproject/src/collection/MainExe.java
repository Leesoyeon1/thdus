package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hr.EmpDAO;
import inheritances.Employee;

public class MainExe {
	public static void sort(int[] iary) {
		Arrays.sort(iary);

	}

	public static void main(String[] args) {
		int[] intAry = null;
		intAry = new int[] { 3, 8, 4 };
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		Arrays.asList(3, 8, 4);

		List<Integer> aList = new ArrayList<>();
		aList.add(3);
		aList.add(8);
		aList.add(4);
		aList.add(2);
		aList.add(1);
		aList.add(0);
		int temp = -1;
		for (int j = 0; j < aList.size()-1; j++) {
			for(int i = 0; i<aList.size()-1; i++) {
			if (aList.get(0) > aList.get(1+1)) {
				temp = aList.get(0);
				aList.set(0, aList.get(i+1));
				aList.set(i +1,  temp);
			}
			}
		}
		for(Integer i : aList) {
			System.out.println();
		}

		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
		System.out.println("salary가 5000이상인 사원정보>>");
		
	}

}
