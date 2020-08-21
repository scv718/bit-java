package com.java.api.generics.v1;

public class BoxApp {

	public static void main(String[] args) {
		// 정수를 담을 수 있는 박스를 생성
		
		Box intBox = new Box(); // 가능(Object)
		intBox.setContent(2020);
		
		// 값을 꺼내와 봅니다
		// Object이므로 다운 캐스팅 필요
		int content = (int)intBox.getContent();
		System.out.println("박스의 내용물: "+content);
		
		Box strBox = new Box();
		strBox.setContent("Java"); // 가능 Object
		
		// 값을 꺼내와 봅니다
		
		String strcontent = (String)strBox.getContent();
		System.out.println("박스의 내용물은: "+strcontent);
		
		// 먄약 캐스팅을 잘못하면?
		strcontent = (String)intBox.getContent();
		System.out.println("박스의 내용물: "+strcontent);
 
	}

}
