package com.java.oop.shape.v1;

// 1. 생성자의 문제
// 2. 추상 메서드 구현의 문제
public class Circle extends Shape{
	// x, y필드와 draw, area 메서드를 상속
	// 자신만의 필드
	protected double radius; // 반지름
	
	// 생성자
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	// 추상 클래스를 상속받은 자식 클래스는 추상 메서드를 "반드시" 구현해줘야 한다.
	@Override
	public void draw() {
		// 출력코드
		System.out.printf("원(x = %d,y = %d, r = %f, area = %f) 을 그렸습니다.%n", x,y,radius,area());
	}
	@Override
	public double area() {
		// 면적 구하기
		double result = Math.PI * Math.pow(radius, 2); // radius의 제곱
		return result;
	}
}
