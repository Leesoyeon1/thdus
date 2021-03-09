package BoardPkg.model;

public interface Service {//기능을 정리해주는 인터페이스 ,메인메소드에서 호출
	public Board[] getBoardList();//전체 목록
	public Board getBoard(int boardNo);//한건조회
	public void creatBoard(Board board);//게시글 작성
	public void modifyBoard(Board board);//글수정
	public void reoveBoard(Board board);//글삭제
	
}
