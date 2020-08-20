package com.java.api.objectclass.v5;

import java.util.Arrays;

// v5

public class Scoreboard implements Cloneable{
	// 필드: 참조타입
	private int scores[]; // 정수배열
	
	// 생성자
	
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	// 복제 메서드
	
	public Scoreboard getClone() {
		
		Scoreboard clone = null;
		try {
		clone = (Scoreboard)clone();
		}catch(CloneNotSupportedException e) {
			System.err.println("복제를 지원하지 않음");
		}
		return clone;
		
		
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Scoreboard [scores =" + Arrays.toString(scores) + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Scoreboard clone = (Scoreboard)super.clone(); // Object의 복제
		// 내부 참조 필드를 복제
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;
	}
	
	
	

}
