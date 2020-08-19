package com.java.api.objectclass.v1;

// java의 최상위 클래스느  Object
public class Point {

	protected int x;
	protected int y;
	

	public Point() {
		
		
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 생성자");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

	public void draw() {
		System.out.printf("점(%d, %d)을 그렸습니다.%n", x,y);
	}

	public void draw(boolean show) {

		String message = show ?"그렸습니다":"지웠습니다.";
		
		System.out.printf("점(%d,%d)을 %s%n",x,y,message);
	}

	// toString : 출력코드 혹은 문자열과의 연결시 호출되어서 내용을 문자열로 반환
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]"; // 출력 포맷
	}
	

	

}
