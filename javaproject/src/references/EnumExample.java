package references;

import java.util.Calendar;
enum Kind{
	MALE,FEMALE;
}
enum Choice{
	YES,NO;
}

public class EnumExample {
	public static void main(String[] args) {
		int maleOrFemale = 1;//1.남자,2.여자
		int yesOrNo = 1;//1.yes 2.No
		Week today = null;
		today = Week.SUNDAY;
//		today = "Hello"; - 파일이 달라서 쓸 수 없다.
		Calendar cal = Calendar.getInstance();// 날짜를 지정해주는 클래스
		System.out.println("년도 " + cal.get(Calendar.YEAR));// 보고싶은 정보들은 cal.get안에 저장하여 봄
		System.out.println("월 " + cal.get(Calendar.MONTH));
		System.out.println("일 " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 " + cal.get(Calendar.DAY_OF_WEEK));// 요일은 번호로 나옴

		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2: today = Week.MONDAY;
			break;
		case 3: today = Week.TUESDAY;
			break;
		case 4: today = Week.WEDNESDAY;
			break;
		case 5: today = Week.THURSDAY;
			break;
		case 6: today = Week.FRIDAY;
			break;
		case 7: today = Week.SATURDAY;
			break;

		}
		if(today == Week.SUNDAY||today ==Week.SATURDAY) {
			//if (Week == 1|| Week == 2)
			System.out.println("주말에는 여행을 갑니다.");
		}else {
			System.out.println("주중에는 공부를 합니다.");
			
		}
		Kind manOfWoman = Kind.FEMALE;
		if(manOfWoman == Kind.MALE) {
			System.out.println("남성입니다.");
			
		}else if(manOfWoman == Kind.FEMALE){
			System.out.println("여성입니다.");
		}
	}

}
