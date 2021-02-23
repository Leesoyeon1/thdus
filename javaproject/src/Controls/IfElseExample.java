package Controls;

public class IfElseExample {
public static void main(String[] args) {
	String grade = "F";
	int score = 95;
	
	//if 구문과 90점 이상 -> A-> 95 이상 A+
	//80점 이상이면 -> B -> 85점 이상 B+
	//70점 이상이면 -> C-> 75점이상 C+
	//그외에는 -> F
	
	//점수 85는 B입니다.//	grade = score>=90? "등급은 A" :score<=80? "등급은 B": score >=70? "등급은 C" : "등급은 F";
//System.out.println(grade); - 삼항연산자
	if(score>=90) {
		if(score>=95) {
			System.out.println("등급은 A+");
		}else {
			System.out.println("등급은 A");
		}
		
	}
	else if(score>=80) {
		if(score>=85) {
			System.out.println("등급은 B+");
		}else {
			System.out.println("등급은 B");
		}
		
	}
		else if(score>=70) {
			if(score>=95) {
				System.out.println("등급은 A+");
			}else {
				System.out.println("등급은 A");
			}

		}

}
}

