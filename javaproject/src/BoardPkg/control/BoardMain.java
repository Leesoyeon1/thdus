package BoardPkg.control;

import java.util.Scanner;

import BoardPkg.model.Board;
import BoardPkg.model.Service;
import BoardPkg.model.imp1.ServiceImp1;

public class BoardMain {// 실행되는 메인 클래스
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu = 0;

		Service service = new ServiceImp1();
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1.입력, 2.수정 3.삭제 4.조회 5.리스트 9.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택>");
			menu = scn.nextInt();
			if (menu == 1) {// 입력처리
				System.out.println("게시글 번호 입력>");
				int boardNo = scn.nextInt();
				System.out.println("게시글 제목 입력>");
				String title = scn.nextLine();
				System.out.println("게시글 내용 입력>");
				String content = scn.nextLine();
				System.out.println("게시글 작성자 입력>");
				String writer = scn.nextLine();
				Board board = new Board(boardNo, title, content, writer, null);
				service.creatBoard(board);

			} else if (menu == 2) {// 수정처리
				System.out.println("게시글 번호입력>");
				int boardNo = scn.nextInt();
				scn.nextLine();
				System.out.println("게시글 내용입력");
				String content = scn.nextLine();

				Board board = new Board(boardNo, null, null, null, null);
				service.modifyBoard(board);

			} else if (menu == 3) {// 삭제처리
				System.out.println("게시글 번호입력>");
				int boardNo = scn.nextInt();
				scn.nextLine();
				Board board = new Board(boardNo, null, null, null, null);
				service.reoveBoard(board);

			} else if (menu == 4) {// 조회
				System.out.println("게시글 번호입력>");
				int boardNo = scn.nextInt();
				scn.nextLine();
				Board board = service.getBoard(boardNo);
				service.getBoard(boardNo);

			} else if (menu == 5) {// 리스트
				Board[] list = service.getBoardList();
				for (Board bo : list) {
					if (bo != null)
						System.out.println(bo.toString());
				}

			} else if (menu == 9) {// 종료
				break;
			}
		}
	}
}
