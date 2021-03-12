package collection;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		String[] strAry = new String[10];
		strAry[0] = "Hello";
		strAry[1] = "World";
		strAry[2] = "Nice";
		for (int i = 0; i< strAry.length; i++) {
			if(strAry[i]  != null) {
				System.out.println(strAry[i]);
			}
		}
		ArrayList strList = new ArrayList();
		strList.add("Hello");//0
		strList.add("Nice");//1
		strList.add("Good");//2
		strList.add(0, "Very");
		
		System.out.println(strList.size());
		strList.remove(2);
		System.out.println(strList.size());
//		for(int i = 0; i<50; i++) {
//			strList.add(String.valueOf(i));
//		}
//		strList.add(100);
		for(Object obj : strList) {
			String str = (String) obj;
			System.out.println(str);
		}
		
	}

}
