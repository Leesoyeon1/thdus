package BoardPkg.control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import BoardPkg.common.DBcon;
import BoardPkg.model.Board;

public class BoardDAO {// 필드영역
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;
	private Board boards;

	public void close() {
		if (rs != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

//전체리스트
	public Board[] selectBoards() {
		sql = "select * from board order by board_no desc";
		conn = DBcon.getConnection();// connection을 연결함
		Board[] boards = new Board[100];
		int i = 0;
		try {
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);// 쿼리 결과를resultset에 담는다.
			while (rs.next()) {// 한건조회한 데이터를 brd에 담음
				Board brd = new Board();
				brd.setBoardNo(rs.getInt("board_no"));
				brd.setTitle(rs.getString("title"));
				brd.setContent(rs.getString("content"));
				brd.setWriter(rs.getString("writer"));
				brd.setCreationDate(rs.getString("creation_date"));

				boards[i++] = brd;// 데이터를 가져온 갯수 만큼 brd를 담아준다.
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오류가 발생했습니다.");
		} finally {
			close();
		}
		return boards;

	}

	// 한건조회
	public Board selectBoard(int boardNo) {
		sql = "select*from board where board_no" + boardNo;
		conn = DBcon.getConnection();
		Board brd1 = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				brd1 = new Board(rs.getInt("board_no"), rs.getString("title"), rs.getString("content"),
						rs.getString("writer"), rs.getString("creation_date"));
			}
		} catch (SQLException e) {// 에러가 나면 알려줌
//				e.printStackTrace();
			System.out.println("조화처리중에 에러가 발생했습니다.");
		} finally {// 정상실행이나 예외발생을 해도 항상 실행해야할 내용이 있으면 구현

		}

		return boards;// 리턴해줘야 함

	}

	// 입력
	public void insertBoard(Board board) {
		conn = DBcon.getConnection();
		sql = "insert into board values("//
				+ board.getBoardNo()//
				+ ", '" + board.getTitle() + "' "//
				+ ", '" + board.getContent() + " '"//
				+ ", '" + board.getWriter() + " '" //
				+ ", sysdate"//
				+ ")";
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 수정
	public void updateBoard(Board board) {
		conn = DBcon.getConnection();
		String sql = "update board";

		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

	}

	// 삭제
	public void deleteBoard(Board board) {

		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			System.out.println(r + "건 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
}
