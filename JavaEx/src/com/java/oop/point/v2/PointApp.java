package com.java.oop.point.v2;

public class PointApp {

	public static void main(String[] args) {
		Point p1 = new Point(); // 기본 생성자
		p1.setX(10);
		p1.setY(20);
		
		Point p2 = new Point(20,30); // 사용자 생성자 사용
	
		p1.draw();
		p2.draw();

	}

}
