package Object;

public class Student2 {
	private String name;
	private int eng;
	private int math;

	public Student2() {// 생성자

	}

	public Student2(String name, int eng, int math) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;

	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

}
