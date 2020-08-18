package com.java.oop.summary;

public class TheOne extends Human implements Flyable, Kungfu { // 부모클래스는 한개여야하지만 인터페이스는 여러개가 가능

	public TheOne(String name, int age) {
		super(name, age);
	}

	@Override
	public void kungfu() {
		System.out.printf("%s: I know Kungfu %n", name);
		
	}

	@Override
	public void fly() {
		System.out.printf("%s: I believe I can Fly%n", name);
		
	}
	
	
}
