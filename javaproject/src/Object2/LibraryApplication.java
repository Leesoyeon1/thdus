package Object2;

import java.util.Scanner;

public class LibraryApplication {
	public static void main(String[] args) {
		Book[] bookList = new Book[2];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.도서정보입력 2.회원정보입력 3.도서대여 4.도서반납 5.도서부록 9.종료");
			System.out.println("----------------------------------------------------------");
			System.out.println("선택>");
			int menu = scn.nextInt();
			scn.nextLine();
			
			if (menu == 1) {
			
				for(int i =0; i < bookList.length; i++) {
					System.out.print("책제목");
					String name = scn.nextLine();
					System.out.print("저자");
					String writer = scn.nextLine();
					System.out.print("출판사");
					String publish = scn.nextLine();
					System.out.print("가격");
					int price = scn.nextInt();
					scn.nextLine();
					
					bookList[i]= new Book(name,writer,publish,price);
			
				}
				
			}else if ( menu ==2 ) {
				System.out.println("ID입력>");
				String id = scn.nextLine();
				System.out.println("회원이름입력>");
				String name = scn.nextLine();
				user = new Member(id,name);
				
				
				
			}else if (menu ==3 ) {
				
				for(int i =0; i < bookList.length; i++) {
				System.out.println("도서대여 가능 목록" + bookList[i].getName());//return값을 가져옴
				
				
				
				}
				
			}else if (menu == 4) {
				
			}else if (menu == 5) {
				
			}else if (menu==9) {
				
			}
		}
		
	}

}
