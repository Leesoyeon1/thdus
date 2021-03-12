package collection;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String>List = new ArrayList<>();
		
		long startTime, endTime;
		startTime =System.nanoTime();
		for (int i = 0; i<10000000; i++) {
			List.add(0, String.valueOf(i));
			
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간:" + (endTime = startTime));
		
		List = new LinkedList<>();
		startTime = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			List.add(String.valueOf(i));
			
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간: "+ (endTime-startTime));
	}

}
