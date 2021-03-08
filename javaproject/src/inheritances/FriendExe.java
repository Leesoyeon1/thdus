package inheritances;

import java.util.Scanner;

public class FriendExe {
	private static Friend1[] friend1 = new Friend1[10];
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("====================================================");
			System.out.println("1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6.종료");
			System.out.println("====================================================");
			System.out.println("선택>");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				System.out.println("이름을 입력하세요.");
				String name = scn.nextLine();
				System.out.println("번호를 입력하세요");
				String number = scn.nextLine();
				for (int i = 0; i < friend1.length; i++) {
					if (friend1[i] == null) {
						friend1[i] = new Friend1(name, number);
						break;
					}
				}
			} else if (selectNo == 2) {
				System.out.println("이름을 입력하세요.");
				String name = scn.nextLine();
				System.out.println("번호를 입력하세요.");
				String number = scn.nextLine();
//				for (int i = 0; i < friend1.length; i++) {
//					if (friend1[i] == null) {
//				
//						friend1[i] = new Friend1(school, name, number);
//						break;
				Friend1 friend1 = new Friend1( name, number);
				saveFriend(friend1);
					}
				}
			} else if (selectNo == 3) {
				System.out.println("이름을 입력하세요.");
				String name = scn.nextLine();
				System.out.println("번호를 입력하세요.");
				String number = scn.nextLine();
				for (int i = 0; i < friend1.length; i++) {
					if (friend1[i] == null) {
						friend1[i] = new Friend1(company, name, number);
						break;
//						saveFriend(new ComFriend("","",""));
					}

				}
			}else if (selectNo == 4) {
				
			}else if (selectNo == 5) {
				System.out.println("찾을 이름 입력:");
				String findName = scn.nextLine();
				for(Friend1 friend1 : friend1) {
					if (friend1 !=null&&friend1.name.equals(name))
						System.out.println("친구정보: "+ friend1.toString());
				}
			}else if (selectNo == 6){
			}
			public static void saveFriend(Friend1,friend1) {
				for (int i = 0; i < friend1.length; i++) {
					if()
				}
			}
		}
	}
}
