package com.javaex.ex06;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Person p01 = new Person("정우성", 45);
		p01.showinfo();
		*/
		Student s01 = new Student();
		s01.setName("이정재");
		s01.setAge(45);
		s01.setSchoolName("서울고등학교");
		
		s01.showinfo();
		
		Student s02 = new Student("이효리", 40, "제주고등학교");
		s02.showinfo();
		
		Person p = new Student();
		p.showinfo();

	}

}
