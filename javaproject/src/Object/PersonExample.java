package Object;

public class PersonExample {
public static void main(String[] args) {
	//문자열:이름, 정수:나이 int[],String[]
	//person[]:String,int
			new Person();//null이나 0의 초기화 값을 가짐 (person에 선언)
			Person[]persons = new Person[5];
			persons[0]= new Person("홍길동",15,175.5,72.5);
			persons[1]= new Person("김길동",25,125.5,32.5);
			persons[2]= new Person("이길동",22,185.5,82.5);
			persons[3]= new Person("박길동",19,145.5,42.5);
			persons[4]= new Person("최길동",35,185.5,82.5);
			for (Person person : persons) {
				if (person.age > 20 && person.height > 180.0) {
					person.introduce();//if 안에 변수 선언
				}
//				

			}
		}
}

