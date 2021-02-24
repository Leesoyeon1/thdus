package Controls;

public class Morning0224 {
	public static void main(String[] args) {
		//영어,수학점수 답을 변수선언
		//평균이 90이상->수 80점이상 ->우 70점이상 ->미 70점미만 ->가
		//값을 담을 변수 선언
		//math.random()사용하기
		
		int eng = (int)((Math.random()*100)+1);
		int math = (int)((Math.random()*100)+1);
		System.out.println(eng+" "+math+" " + ((eng+math)/2));
		System.out.println(getAverage(eng,math));
		
	}
		public static String getAverage(int eng, int math) {
			
			int score = (eng+math)/2;
			String grade;
			
			if (score>=90) {
				grade = "수";
			}else if (score>=80){
				grade = "우";
			}else if (score>=70) {
				grade = "미";
			}else {
				grade = "가";
				
			}
			
			return grade; 
		}

}
