package com.java.basic;

public class TypeEx {
	public static void main(String[] args) {
		
		intLongTest();
		floatDoubleTest();
		boolenaEx();
		charEx();
		constantEx();
		
		
	}
	// 상수 연습(Constant)
	public static void constantEx() {
		// 상수는 변하지 않는 데이터
		//  final 을 선언부 앞에 붙이면 된다
		// 상수 식별자는 모두 대문자, 여러단어 결합시
		// 단어사이에 _ 추가 
		final double PI = 3.14159;
		
		// 상수 값을 변경하면 해당 상수를 사용한 모든 코드가
		// 변경
		// 1. 코드의 가독성
		// 2. 코드 유지 보수의 장점
		final int SPEED_LIMIT = 110;
		
		System.out.println("PI = "+ PI);
		System.out.println("제한속도: "+ 110);
		
		//SPEED_LIMIT = 80; // 상수이므로 변경 불가하게 된다

		System.out.println("제한속도: "+SPEED_LIMIT);
		
	}
	
	// char형 연습
	public static void charEx() {
		// 2바이트(부호 없음)
		// 유니코드 한 글자의 수치화된 코드
		// ' < char
		// ""< string 
		// 두개는 다르다
		
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println("A - > "+ ch1);
		System.out.println("한 - > "+ ch2);
		
		System.out.println(ch1 + ch2);
		
		
	}
	//  boolean 연습
	public static void boolenaEx() {
			
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int v1 = 3;
		int v2 = 5;
		
		boolean result = v1 < v2;
		
		System.out.println("v1<v2 ?" +result);
		

			
	}
	
	
	public static void floatDoubleTest() {
		
		float fVar = 3.14159F; // float 는 마지막에 F
		double dVar = 3.14159;
		
		// 정밀도 파악
		fVar = 0.1234567890123456789F;
		dVar = 0.1234567890123456789;
		
		System.out.println("float: "+fVar);
		System.out.println("double: "+ dVar);
		
		// 지수 표기법
		fVar = 1234567890E-10F;
		System.out.println(fVar);
		
		// 실수 자료형의 처리는 정밀도가 떨어진다(표현 볌위를 넓힘)
		
		System.out.println(0.1*3); // 0.30000000000000004
		
		// 금융권 같은 정밀도를 요구하는 개발에는 float , double
		// 사용은 유의해야한다. 
		
	}
	
	
	
    public static void intLongTest() {
		
    	int intVar1;
		intVar1 = 2020;
		int intVar2 =  2020;
		
		System.out.println(intVar1);
		System.out.println(intVar2);
		
		// long : 8byte
		long longVar1;
		longVar1= 2020;
		long longVar2 = 12345678912345678L;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
	
		// 2진수, 8진수, 16진수
		int bin = 0b1100; // 2진수 0b로 시작
		int oct = 010;    // 8진수는 0으로 시작
		int hex = 0xFF;   // 16진수는 0x로 시작
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}

	
	
}


