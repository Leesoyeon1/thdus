package com.yedam.diary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StdInputUtil {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static SimpleDateFormat df = new SimpleDateFormat("yyMMdd");

	static int readInt() {
		int result = 0;

		do {
			try {
				String temp = br.readLine();
				result = Integer.parseInt(temp);
				break;
			} catch (IOException e) {
				System.out.println("숫자 형식이 아닙니다.");
			}
		} while (true);

		return result;
	}

	// 날짜입력
	public static String readDate() {
		String result = "";

		do {
			try {
				result = br.readLine();
				result = result.trim();
				Date w = df.parse(result);
				System.out.println(df.format(w));
				
				break;
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("날짜 형식이 아닙니다.");
			}
		} while (true);
		return result;
	}

	// 여러줄 입력
	public static String readMultiLine() {
		StringBuffer result = new StringBuffer();
		try {
			while (true) {
				String temp = br.readLine();// 한 라인 읽어오기
				if (temp.equals("end")) {
					break;
				}
				result.append(temp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();

	}


	public static String readContent() {
		String result = "";

		do {
			try {
				result = br.readLine();
				result = result.trim();
				Date w = df.parse(result);
				System.out.println(result);
				result = df.format(w);
				break;
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("다시 입력");
			}
		} while (true);
		return result;
	}
	

}
