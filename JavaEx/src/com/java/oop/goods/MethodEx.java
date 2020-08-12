package com.java.oop.goods;

public class MethodEx {

	public static void main(String[] args) {
		System.out.println("sum: "+ sum(10,20));
		printMessage("Java Method 연습");
		System.out.println("가변인수 연습: "+ sum(10,20,30,40,50));
		printSum("고정인수 + 가변인수 연습: ", 10,20,30,40,50);
		
	}
	// 고정인수, 가변인수를 함께 사용 가능
	// 순서: 고정 인수 -> 가변 인수
	private static void printSum(String message, double ...values) {
		double total = sum(values);
		System.out.println(message+":" + total);
	}
	private static double sum(double ...values) {
		System.out.println("인수의 갯수:" + values.length);
		double total = 0;
		for (double val: values) { // 향상된 for문
			total += val;
		}
		return total;
	}
	private static double sum(double a, double b) {
		return a+b;
	}
	private static void printMessage(String message) {
		// return 할 데이터가 없으면 void
		System.out.println(message);
	}

}
