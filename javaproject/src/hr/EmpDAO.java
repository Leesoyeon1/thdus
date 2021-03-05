package hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import inheritances.Employee;

public class EmpDAO {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
	String passwd = "hr";
	Connection conn = DBUtil.getConnection(url, user, passwd);

	public Employee[] empList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from emp_java";
		Employee[] employees = new Employee[100];

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();// exeQuery로 쿼리 결과를 받아옴 ,resultset이라는 배열로 값을 담아놓음.
			int i = 0;
			while (rs.next()) { // next()라는 메소드는 가져올 데이터가 있는지 없는지 여부를 체크하여 true,false
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstname(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
			
					employees[i++] = emp;
				

				System.out.println("---------------------------");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}

		System.out.println("메소드 호출 완료.");
		return employees;

	}

}
