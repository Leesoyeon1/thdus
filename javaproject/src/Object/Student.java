package Object;

public class Student {
	
			   // 속성(필드)-값을 담음
			   String studentNo; //p21010101
			   int grade;
			   int math;
			   int eng;
			   
			   //생성자:필드값을 초기화
			   
			 public Student(String studentNo) {
				 this.studentNo = studentNo;
			   }
			   
			   //기능(메소드)-기능을 처리
			   public void study() {
			     System.out.println("공부합니다. ");
			      
			   }
			   
			   public void run() {
			      System.out.println("운동을 합니다");
			   }
			   
			   void introduce() {
			      
			      System.out.println("학번: " + studentNo + ", 학년:" + grade);
			   }


}
