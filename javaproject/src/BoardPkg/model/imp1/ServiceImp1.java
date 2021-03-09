package BoardPkg.model.imp1;

import BoardPkg.control.BoardDAO;
import BoardPkg.model.Board;
import BoardPkg.model.Service;

public class ServiceImp1 implements Service {
	BoardDAO dao = new BoardDAO();

	@Override
	public Board[] getBoardList() {
		// TODO Auto-generated method stub
		return dao.selectBoards();
	}

	@Override
	public Board getBoard(int boardNo) {
		// TODO Auto-generated method stub
		return dao.selectBoard(boardNo);
	}

	@Override
	public void creatBoard(Board board) {
		// TODO Auto-generated method stub
		dao.insertBoard(board);
	}

	@Override
	public void modifyBoard(Board board) {
		// TODO Auto-generated method stub
		dao.updateBoard(board);
	}

	@Override
	public void reoveBoard(Board board) {
		// TODO Auto-generated method stub
		dao.deleteBoard(board);
	}


}
