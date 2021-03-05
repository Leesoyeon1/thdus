package hr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptDAO {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
	String passwd = "hr";
	Connection conn = DBUtil.getConnection(url, user, passwd);

	public Department[] deptList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from departments";
		Department[] departments = new Department[100];

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();// exeQuery로 쿼리 결과를 받아옴 ,resultset이라는 배열로 값을 담아놓음.
			int a = 0;
			while (rs.next()) { // next()라는 메소드는 가져올 데이터가 있는지 없는지 여부를 체크하여 true,false
				Department dept = new Department();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setManagerId(rs.getInt("manager_id"));
				dept.setLocationId(rs.getInt("location_id"));

				departments[a++] = dept;

				System.out.println("---------------------------");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}

		System.out.println("메소드 호출 완료.");
		return departments;

	}
}
