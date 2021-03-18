package zzz;

public class Employee {
	int num;
	String name;
	String date;
	String dept;
	int salary;
	
	
	public Employee(int num, String name, String date, String dept, int salary) {
		this.num=num;
		this.name= name;
		this.date = date;
		this.dept = dept;
		this.salary= salary;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", date=" + date + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	

}
