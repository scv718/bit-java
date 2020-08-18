package com.java.oop.summary;

public class Human extends Animal {

	public Human(String name, int age) {
		super(name, age);
	}
	@Override
	public void say() {
		System.out.println(name+"가 말한다.");

	}

}
