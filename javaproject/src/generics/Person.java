package generics;

public class Person {
	String name;//필드

	Person(String name) {
		this.name = name;//생성자

	}

	String getName() {//메소드
		return this.name;

	}

}// person 상속받는 worker클래스

class Worker extends Person {
	Worker(String name) {
		super(name);
	}

}

//person상속받는 student
class Student extends Person {
	Student(String name) {
		super(name);
	}
}// student 상속받는 highStudent

class HighStudent extends Student {
	HighStudent(String name) {
		super(name);
	}
}// 수업과정

public class Course<T> {
	String courseName;
	T[] students;

	Course(String courseName, int capacity) {
		this.courseName = courseName;
		students = (T[]) new Object[capacity];//

	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	public String getCourseName() {
		return.this.coursetName;
	}
	public T[] getStudents() {
		return this.students;
	}

}