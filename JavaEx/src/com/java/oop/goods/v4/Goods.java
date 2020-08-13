package com.java.oop.goods.v4;

// v4
// this
public class Goods {

	// public >> protected >> default >> private
	
	private String name;
	private int price;
	

	// 생성자 오버로딩 : 생성자가 여러개 있을 수 있다.
	// 생성자 1
	public Goods(String name) {
		System.out.println("생성자");
		this.name = name;
	}
	
	// 생성자 2
	public Goods(String name, int price) {
		// 이미 일부의 정보를 초기화하는 생성자가 있을 때
		// this()로 호출하고 나머지 정보를 초기화
		// 설정 정보가 복잡 할 경우 , 코드의 중복을 줄일 수 있다.
		this(name);
		this.price = price;
		System.out.println("생성자2");
		
		
	}
	// Getter / Setter
	// 은닉된 필드를 우회 접근하기 위한 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메서드
	public void showInfo() {
		// 내부 필드의 정보를 출력
		System.out.printf("%s, 가격 %d원%n", name, price);
	}
}
