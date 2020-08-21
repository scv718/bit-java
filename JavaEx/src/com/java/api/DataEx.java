package com.java.api;

import java.text.*;
import java.util.*;

// Data 클래스와 Calender 클래스를 연습
public class DataEx {

	public static void main(String[] args) {
		// 날짜 데이터의 획득
		Date now = new Date();
		String nowStr = now.toString();
		
		System.out.println("현재 날짜: "+nowStr);
		System.out.println("현지화된 날짜: "  +now.toLocaleString());
		// Depercated 된 메서드는 사라질 메서드 (toLocalString) -> 다른 방식으로 교체
		
		// 형식화된 출력
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);		
		System.out.println("FULL 포맷: "+df.format(now));
		// FULL, LONG, MEDIUM, SHORT
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG 포맷: "+df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM 포맷: "+df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT 포맷: "+df.format(now));
		
		
		// 자유로운 날짜 데이터 포매팅
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println("SDF: " +sdf.format(now));
		

	}

}
