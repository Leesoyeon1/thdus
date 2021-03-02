package Object;

public class Person {
	String name;
	int age;
	double height;
	double weight;//이름, 나이,키,몸무게 선언
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height=height;
		this.weight = weight;
	}
	
	Person(){
		
	}
	void introduce() {
		System.out.println("이름은 "+ this.name + "나이는" + this.age + "입니다.");

}
//public class PersonExample{
//	public static void main(String[] args) {
//		Person[]persons = new Person[5];
//		persons[0]= new Person("홍길동",15,175.5,72.5);
//		persons[1]= new Person("김길동",25,125.5,32.5);
//		persons[2]= new Person("이길동",22,185.5,82.5);
//		persons[3]= new Person("박길동",19,145.5,42.5);
//		persons[4]= new Person("최길동",35,185.5,82.5);
//	}
}