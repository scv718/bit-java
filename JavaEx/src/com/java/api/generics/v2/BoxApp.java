package com.java.api.generics.v2;

public class BoxApp {

	public static void main(String[] args) {
		// 정수를 담을 수 있는 박스를 생성
		
		//Box<Integer> intBox = new Box<Integer>(); // 타입을 Integer로 재정의
		Box<Integer> intBox = new Box<>(); // 뒤의것은 생략 가능
		intBox.setContent(2020);
		// intBox.setContent("2020"); // 컴파일러가 Generics를 체크
		
		// 값을 꺼내와 봅니다
		// 내부 데이터가 Integer 임이 확실 -> 캐스팅이 불필요
		int content = intBox.getContent();
		System.out.println("박스의 내용물: "+content);
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java"); // 가능 (String 타입 지정)
		
		// 값을 꺼내와 봅니다
		
		String strcontent = strBox.getContent(); // 캐스팅 불필요
		System.out.println("박스의 내용물은: "+strcontent);
		
		
		// 먄약 캐스팅을 잘못하면?
		// 전과 다르게 컴파일이 아예 안됨
		//strcontent = (String)intBox.getContent();
		//System.out.println("박스의 내용물: "+strcontent);
 
	}

}
