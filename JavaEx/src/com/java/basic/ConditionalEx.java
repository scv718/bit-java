package com.java.basic;

import java.util.Scanner;

public class ConditionalEx {
	public static void main(String[] args) {
		
		//ifElseEx();
		//ifElseEx2();
		//ifElseEx3();
		//switchEx();
		//switchEx2();
		//whileEx();
		//whileEx2();
		//whileEx3();
		doWhileEx();
	
	}
	public static void doWhileEx() {
		// 숫자를 입력 받아서 합산
		// 0을 입력 받으면 반복을 종료
		
		int num = 0;
		int total = 0; // 합산 변수
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("정수 입력.[0이면 종료]");
			num = scanner.nextInt();
			total += num;

		}	while(num != 0);
		System.out.println("정수 총합"+total);
	}
	public static void whileEx3() {
		// while은 종료를 위한 제어 변수를 잘 제어하여 무한루프에 빠지지 않게 해야한다
		// 경우에 따라서는 의도적으로 무한루프를 사용
		
		while(true) {// 조건이 트루면 항상 반복
			System.out.println("무한루프...Ctrl+c to quit");
		}	
	}
	public static void whileEx2() {
		// 단수를 입력, 해당 단의 곱셈표를 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("단수 입력: ");
		int dan = scanner.nextInt();
		// 제어용 변수
		int i = 1;
		
		while ( i <= 9) {
			System.out.println(dan+ "*" +i+"="+(dan*i));
			i++;
		}
		scanner.close();
	}
	
	public static void whileEx() {
		// 반복문을 사용, 1부터 100까지 숫자를 합산하여 출력
		int num = 1; // 시작값; 조건 비교
		
		int total = 0; // 합산 변수
		
		while(num <= 100) {
			total += num;
			// 주의 : while은 반복 조건을 개발자가 직접 컨트롤]
			num++;
		}
		System.out.println(+total+","+num);
		
	}
	public static void switchEx2() {
		// 월정보(정수) 입력
		// 1, 3, 5, 7, 9, 11 -> 31일
		// 2 -> 28일
		// 4, 6, 8, 10, 12 -> 30일 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("월 입력: ");
		int month = scanner.nextInt();
		String days = "";
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			days = "31일";
			break;
		case 2:
			days = "28일";
			break;
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			days = "30일";
			break;
		}
		System.out.println(month+"월" +days);
		scanner.close();
	}
		
		
	public static void switchEx() {
		// switch는 전달받은 변수의 값을 이용해서 흐름을 제어(==)
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1:C, 2:C++, 3:JAVA, 4:PYTHON");
		
		int code = scanner.nextInt();
		
		switch(code) {
		case 1: // code == 1
			System.out.println("R101");
			break;
		case 2:
			System.out.println("R202");
			break;
		case 3:
			System.out.println("R303");
			break;
		case 4:
			System.out.println("R404");
			break;
		default:
			System.out.println("관리자 문의");
			break;
		}
		scanner.close();
			
		
	}
	public static void ifElseEx3() {
		// 과목 번호 입력
		// 1 - > R101, 2 - > R202, 3 - > R303, 4 - > R404
		// 나머지 - > 관리자 문의
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1:C, 2:C++, 3:JAVA, 4:PYTHON");
		int code = scanner.nextInt();
		
		if(code == 1) {
			System.out.println("R101");
		}else if(code ==2) {
			System.out.println("R202");
		}else if(code == 3) {
			System.out.println("R303");
		}else if (code == 4) {
			System.out.println("R404");
		}else {
			System.out.println("관리자 문의");
		}
		
	}
	public static void ifElseEx2() {
		// 정수 입력
		// 0보다 크면 양수, 0이면 0, 0보다 작으면 음수 출력
		// if ~ elseif ~ else
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력: ");
		int num = scanner.nextInt();
		
//		if(0<num)
//			System.out.println("양수");
//		else if(0>num)
//			System.out.println("음수");
//		else
//			System.out.println("0");
		
		if(num == 0) {
			System.out.println("0입니다");
		}else {
			if (num > 0) {
				System.out.println("양수입니다");
			}else {
				System.out.println("음수입니다.");
			}
		}
			
		scanner.close();
	}
	public static void ifElseEx() {
		// Scanner로 점수를 입력
		// 점수가 60점 이상이면 "합격"
		// 그렇지 않다 (60점 미만이면) "불합격"
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		
		if(score >= 60) {
			System.out.println("합격");
		}else {
			
			System.out.println("불합격");
		}
		
		
		
		
		
	}
}
