package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount; // class variable
	public static String classVar; // class variable
	public String instanceVar; // instance variable
	
	/* 스태틱 블록으로 클래스 변수 초기화 */
	static {
		refCount = 0; // 스태틱 변수 초기화
		classVar = "Static Member"; // 클래스 변수 접근
//		instanceVar = "Instance Member"; // 인스턴스 변수로의 접근은 불가
		System.out.println("초기 refCount: " + refCount);
	}

	public StaticEx() {
		refCount++;
		System.out.println("refcount: " + refCount);
		System.out.println("Intstance 생성!");
	}
	
	protected void finalize() throws Throwable {
		refCount--;
		
		super.finalize();
		System.out.println("소멸자 호출");

	}
}
