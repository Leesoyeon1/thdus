package com.yedam.diary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
//날짜,내용
//테이블
//접속계정

public class DiaryOracleDAO implements DAO {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "diary";
	String passwd = "diary";
	Connection conn;

	public void start() {
		conn = DBUtil.getConnection(url, user, passwd);
	}

	@Override
	public int insert(DiaryVO vo) {
		start();
		int cnt = 0;
		PreparedStatement psmt = null;
		String sql = "insert into diaryDB(wdate,content) values(?,?)";
		try {
			psmt = conn.prepareStatement(sql);//insert구문 실행
			psmt.setString(1, vo.getWdate());
			psmt.setString(2, vo.getCotents());
			psmt.executeUpdate();
			System.out.println("입력완료");
			cnt++;
		} catch (SQLException e) {
			System.out.println("오류가 났습니다.");
			e.printStackTrace();

		} finally {
			DBUtil.close(null, psmt, conn);
		}

		return cnt;
	}

	@Override
	public void update(DiaryVO vo) {
		start();
		int cnt = 0;
		PreparedStatement psmt = null;
		String sql = " ";
		try {
			String query = "update diaryDB set (date=?,content=?)";
			psmt = conn.prepareStatement(sql);
			psmt.executeQuery();
			System.out.println("입력완료");
			cnt++;
		} catch (SQLException e) {
			System.out.println("오류가 났습니다.");
			e.printStackTrace();

		} finally {
			DBUtil.close(null, psmt, conn);
		}

	}

	@Override
	public int delete(String date) {
		start();
		int cnt = 0;
		PreparedStatement psmt = null;
		String sql = "delete from diartDB where date=?";
		try {
			psmt = conn.prepareStatement(sql);//insert구문 실행
			psmt.setString(1, date);
			psmt.executeUpdate();
			System.out.println("입력완료");
			cnt++;
		} catch (SQLException e) {
			System.out.println("오류가 났습니다.");
			e.printStackTrace();

		} finally {
			DBUtil.close(null, psmt, conn);
		}

		return cnt;
	}

	

	@Override
	public DiaryVO selectDate(String date) {
		start();
		PreparedStatement psmt = null;
		String sql = "select * from diaryDB where wdate = '" + date + "'";
		ResultSet rs = null;
		DiaryVO vo = null;
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new DiaryVO(rs.getString("wdate"),rs.getString("content"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, psmt, conn);
		}
		
		return vo;
	}

	

	@Override
	public List<DiaryVO> selectContent(String content) {
		start();
		PreparedStatement psmt = null;
		String sql = "select * from diaryDB where content like ?";
		System.out.println(sql);
		ResultSet rs = null;
		DiaryVO vo = null;
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new DiaryVO(rs.getString("wdate"),rs.getString("content"));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, psmt, conn);
		}
		
		return null;
	}

	

	@Override
	public List<DiaryVO> selectAll() {
		start();
		List<DiaryVO> list = new ArrayList<>();
		PreparedStatement psmt = null;
		String sql = "select * from diaryDB ";
		ResultSet rs = null;
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String date = rs.getString("wdate");
				String content = rs.getString("content");
				list.add(new DiaryVO(date,content));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	
	}
	

	@Override
	public void delete(DiaryVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(String wdate) {
		// TODO Auto-generated method stub

	}

}
