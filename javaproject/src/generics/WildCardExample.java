package generics;

import java.util.Arrays;

public class WildCardExample {
	
	public static void registerCourse() {
		public static void registerCourse(Course<?>course) {
			System.out.println(course.getName()+ " 수강생:"+Arrays.toString(Course.getStudents()));
		}
		public static void registerCourseStudent(Course<? dxtends Student>course) {
			System.out.println(course.getName()+"수강생:"+ Arrays.toString(course.getStudents()));
		}
		public static void main(String[]args) {
			Course<Person> personCourse = new Course<Person>("일반인과정",5);
			
		}
		
	}
	

}
