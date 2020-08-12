package com.java.oop.goods.v1;

public class GoodApp {

	public static void main(String[] args) {
		// Goods 클래스 사용
		Goods notebook = new Goods();
		
		notebook.name = "LG Gram";
		notebook.price = 1500000;

		System.out.printf("%s, %d원%n", notebook.name, notebook.price);
		
		Goods smartphone = new Goods();
		smartphone.name = "iPhone SE";
		smartphone.price = 600000;
		
		System.out.printf("%s, %d원%n", smartphone.name, smartphone.price);
	}

}
