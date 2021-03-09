package abstractClasses;

import java.util.Calendar;

public class CalendarExe {
	private static final String Monday = null;
	private static final String Sun = null;

	public static void main(String[] args) {
		showCal(2021,7);//5월달 달력을 보여주는 메소드
		Calendar cal = Calendar.getInstance();
		
		
	}	public static void showCal(int year, int month) {//해당년월의 달력을 생성해서 보여주는 메소드
		

		// 달력만들기
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		System.out.println("----------------------------------");
		cal.set(2021, 2, 5);
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstday = cal.get(Calendar.DAY_OF_WEEK);

		System.out.printf("%3d,9");
		System.out.printf("%3d,10");
		System.out.printf("%5s", "Sun");
		System.out.printf("%5s", "Monday");
		System.out.println();
		System.out.println("===================================");

		for (int i = 1; i < firstday; i++) {
			System.out.printf("%3d", " ");
		}
		for (int i = 1; i < lastDate; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}

	}

}
