package collection;


import java.util.ArrayList;
import java.util.List;

public class BoardExample {
	List<Board> boads = new ArrayList<Board>();
	
	Board b1 = new Board();
	b1.subject = "test";
	b1.content = "content";
	b1.writer = "user1";
	Board b2 = new Board("java", "very good", "user2");
	Board b3 = new Board("jaVascript", "good","user1");
	
	boards.add(b1);
	boards.add(b2);
	bpards.add(b3);
	boards.add(new Board("javascript", "good", "user1"));
	
	String searchStr = "java";
	for( int i < boards.size; i++) {
		if(boards.get(i).subject.toLowerCase().startsWith(searchStr)) {
			System.out.println(boards.get(i));
		}
		
	}

}
