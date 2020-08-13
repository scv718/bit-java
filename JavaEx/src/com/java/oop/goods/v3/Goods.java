package com.java.oop.goods.v3;

// v3
// 생성자연습
public class Goods {
	// 필드(속성)
	
	// 접근자가 없으면 default
	// 클래스 내부 or 동일 패지키 내에서 접근 가능
	
	/*
	String name;
	int price;
	*/
	
	// public >> protected >> default >> private
	
	private String name;
	private int price;
	
	// 생성자는 반드시 1개 이상 있어야 한다
	// 코드상에 생성자 코드가 하나도 없으면
	// 기본 생성자를 강제로 추가한다
	
	public Goods(String name, int price) {
		// 리턴 타입은 없고
		// 클래스 이름과 동일한 이름
		this.name = name;
		this.price = price;
		
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
