package com.java.oop.goods.v3;

//v3
//생성자연습
public class GoodApp {

	public static void main(String[] args) {
		// Goods 클래스 사용
		// Goods notebook = new Goods(); // 인스턴스화

		Goods notebook = new Goods("LG Gram", 1500000);
		
		// setter를 이용한 우회 접근 
		//notebook.setName("LG Gram");
		//notebook.setPrice(1500000);
		// 메서드 호출
		notebook.showInfo();
		
		Goods smartphone = new Goods("iPhone SE", 600000);
		//notebook.setName("iPhone SE");
		//notebook.setPrice(600000);
		// 메서드 호출
		notebook.showInfo();
		
		/*
		Goods smartphone = new Goods();
		smartphone.name = "iPhone SE";
		smartphone.price = 600000;
		
		System.out.printf("%s, %d원%n", smartphone.name, smartphone.price);
		*/
	}

}
