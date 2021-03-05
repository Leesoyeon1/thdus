package hr;

import inheritances.Employee;

public class MainExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Employee[] empList = dao.empList();
		System.out.println("salary가 5000이상인 사원정보>>");
		for (Employee emp : empList) {
			if (emp != null && emp.getSalary() > 5000) {
				System.out.println(emp.toString());
			}
		}
		DeptDAO dao1 = new DeptDAO();
		Department[] deptList = dao1.deptList();
		for (Department dept : deptList) {
			if (dept != null ) {
				System.out.println(dept.toString());
			}
		}
	}
}
