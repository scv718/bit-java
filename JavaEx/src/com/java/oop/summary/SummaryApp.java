package com.java.oop.summary;

public class SummaryApp {
	// 쿵후 도장 -> 주차장 예를 생각
			static Kungfu[] dojang; // 인터페이스 참조 타입의 배열
	public static void main(String[] args) {
		
		
		Panda p1 = new Panda("핑", 30);

		p1.say();
		
		Human h1 = new Human("홍길동", 28);
		h1.say();
		
		Panda p2 = new KungfuPanda("포", 15);
		
		p2.say();
		
		Human h2 = new TheOne("네오", 50);
		
		h2.say();
		
		fight(p1);
		fight(p2);
		fight(h1);
		fight(h2);
		
		// 각 객체를 도장에 등록
		dojang = new Kungfu[] {
				(Kungfu)p2,(Kungfu)h2
		};
		
		for(Kungfu actor: dojang) {
			actor.kungfu();
		}
	}
	
	private static void fight(Animal actor) {
		// actor 가 Kungfu 인터페이스를 구현했으면 Kungfu 메서드를 사용 가능
		if (actor instanceof Kungfu) {
			// 형변환 
			// 쿵푸 인터페이스를 구현한 클래스
			((Kungfu)actor).kungfu();
		} else {
			// 형변환이 안됨
			System.out.println(actor.name+": 쿵푸 못해요!");
		}
	}

}
