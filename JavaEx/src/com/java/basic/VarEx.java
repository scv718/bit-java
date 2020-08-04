package com.java.basic;

public class VarEx {
	public static void main(String[] args) {
		// 변수 식별자
		// 문자, 숫자, $, _ 의 조합
		// 다만, 숫자로 시작하면 안됨
		
		// 변수명 관례 
		// 변수명은 소문자로 작성
		// 단어의 조합일 경우 두번째 단어는 대문자로 시작
		
		// 선언
		int myAge;
		// 초기화
		myAge = 29;
		
		int myAge2 = 29; // 선언과 초기화를 동시에 할 수 있다.
		
		// myAge = 12345678901234567890; // 에러 범위를 넘었음
		
		// 조회와 변경
		System.out.println("myAge의 내용:" + myAge);
		myAge =  myAge + 1;
		System.out.println("myAge의 내용:" + myAge);
	}

}
