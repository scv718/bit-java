package com.java.oop.casting;

public class Cat extends Animal{
	// 부모로부터의 name 필드, eat, walk 상속
	
	
	// 생성자
	public Cat(String name) {
		super(name);
	}
	
	// 자신만의 메서드
	
	public void meow() {
		System.out.println(name+": 야옹!");
	}

}
