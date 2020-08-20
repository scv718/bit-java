package com.java.api.objectclass.v4;

// v4
public class LangClassTest {

	public static void main(String[] args) {
		Scoreboard s1 = new Scoreboard(new int[] {10,20,30,40});
		
		System.out.println("s1 = "+s1);
				
		// 복제
		Scoreboard s2 = s1.getClone();
		
		System.out.println("s2 = "+s2);
		
		// 두 객체는 같은 객체인가
		System.out.println("s1 == s2 ?" + (s1 == s2));
		
		// 누배 참조 타입은 같은 객체인가?
		System.out.println("s1.scores == s2.scores ? " + (s1.getScores() == s2.getScores()));
	}
	

	
	

	
}
