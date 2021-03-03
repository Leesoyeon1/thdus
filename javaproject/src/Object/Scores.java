package Object;

public class Scores {
	String name;
	int eng;
	int math;
	int sum;
	

	Scores(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.sum = eng+math;
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	Scores() {

	}

	void introduce() {
			System.out.println("이름은 "+ this.name + "영어점수는 " + this.eng + "수학점수는 "+ this.math + "합계는 " +this.sum);

	}

	// TODO Auto-generated constructor stub
}
//학생의 이름,영어,수학점수를 저장
// 클래스를 활용해서 값을 저장할 수 있도록 선언.
// 3명 정도 값을 저장(홍길동,90,85),(이길동,76,90)(김길동 ,88,85)
// 학생의 정보를 저장할 수 있도록 배열
// 학생전체 정보를 보여주도록 (이름 -영어-수학-합계)메소드 생성.for
