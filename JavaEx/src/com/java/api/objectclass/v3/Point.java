package com.java.api.objectclass.v3;

// v3. 복제(얕은 복제)
// 복제 : object.clone() 메서드를 사용
//      ->Cloneable 인터페이스를 구현해야함 clone 사용 가능
public class Point implements Cloneable{

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
	
	// equlas: 내부 값이 같은지 점검 로직 작성
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) { // 클래스 체크
			// 다운캐스트
			Point other = (Point)obj;
			return this.x == other.x && this.y == other.y;
		}
		return super.equals(obj);
	}
	
	public Point getClone() {
		Point clone = null;
		
		try {
		clone = (Point)clone(); // 복제한 후 다운캐스팅
		} catch(CloneNotSupportedException e) {
			System.err.println("복제 불가 객체!");
		}
		return clone;
	}
	
	

	

}
