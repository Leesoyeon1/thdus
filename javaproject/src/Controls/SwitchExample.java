package Controls;

public class SwitchExample {
	public static void main(String[] args) {
		String grade = "F";
		int score = 85;
		
		switch(score/10) {
		case 10: case 9:
			grade = "등급은  A";
			break;
		case 8:
			grade = "등급은 B";
			break;
		case 7:
			grade = "등급은 C";
			break;
			default:
				break;
		}
		System.out.println(grade);
	}

}
