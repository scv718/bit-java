package com.java.oop.shape.v1;

public class Rectangle extends Shape{
	// x, y필드 draw, area 메서드 상속
	
	protected int width;
	protected int height;
	
	// 생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.printf("(x = %d, y = %d, area = %f)을 그렸습니다.%n", x, y, area());

	}

	@Override
	public double area() {
		//double area = width*height;
		//return area;
		return width * height;
	}

}
