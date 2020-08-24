package com.java.api.collection.list;

import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
		// Queue 자료형
		// First in First Out(선입 선출)
		// queue는 인터페이스만 제공
		//   실체 클래스는 List 클래스를 사용
		
		Queue<Integer> queue = new LinkedList<>();

		
		// 데이터의 제공(enqueue) : Offer
		
		for(int i = 1; i <= 10; i++) {
			queue.offer(i);
		}
		System.out.println("QUEUE: " + queue);
		
		// 인출: 방향의 원인
		System.out.println("dequeue: "+queue.poll());
		System.out.println("QUEUE: " +queue);
		
		System.out.println("peek: " +queue.peek()); 
		System.out.println("QUEUE: " +queue);
		
		
		// 전체 데이터의 인출
		// poll 할 때는 isEmpty로 체크 필요
		while(queue.isEmpty()) {  // 비어있지 않으면 루프
			System.out.println("POLL: " +queue.poll());
		}

	}

}
