package com.java.api.generics.v2;

// v2. Generics : 매우 중요
// 타입 파라미터: T->Type

// 많이 사용하는 타입 파라미터 관례
// R: Return Type
// K: Key
// V: Value
//   -> 어겨도 상관없으나 가급적 지키도록
public class Box<T>{
	T content; // 모든 클래스 부모 -> 다 들어감

	
	// getter setter
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
}
