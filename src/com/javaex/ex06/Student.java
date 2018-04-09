package com.javaex.ex06;

public class Student extends Person {

	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}

	public Student(String name, int age, String schoolName) {
		super(name, age);
		/*super.name = name;
		super.age = age;*/
		this.schoolName = schoolName;
	}

	public Student() {
		
		
	}

	public void showinfo() {
		System.out.println("이름: " + name);//protected String name으로 해서 name만 써도 가능
		//System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
		/*System.out.println("이름: " + name);
		System.out.println("나이: " + age);*///상속받은거지만 못씀ㅋ_ㅋ
		System.out.println("학교명: " + schoolName);
	}

}
