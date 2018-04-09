package com.javaex.ex06;

public class Person {

	/* private String name; */
	protected String name;
	protected int age;

	public String getName() {
		return name;
	}

	public Person() {
		super();

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showinfo() {
		System.out.println("===============");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);

	}

}
