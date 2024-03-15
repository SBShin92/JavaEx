package com.javaex.basic.types;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// float (4bytes)
		// double (8bytes) -> 자바는 이 자료형이 실수형의 기본임
		float floatVar;
		double doubleVar;
		
		floatVar = 0.12345678901234567890F; // float의 경우, 숫자 뒤에 F를 붙여서 꼭 명시해주도록 하자.
		doubleVar = 0.12345678901234567890;
		
		System.out.println("float : " + floatVar);
		System.out.println("double : " + doubleVar);
		System.out.println();
		
		int intVar;
		
		intVar = 300000000;
		floatVar = 3E9F;  // 실수 표시할 때, 숫자 + E를 통해 지수부를 표시할 수도 있다.
		doubleVar = 3E-9;
		
		
		System.out.println("int : " + intVar);
		System.out.println("float : " + floatVar);
		System.out.println("double : " + doubleVar);
		System.out.println();
		
		
		// 부동 소수점 계산의 유의점
//		System.out.println(0.1 * 3); // 이렇게 정수형과 실수형을 섞어서 계산하려고 하지 말자(어차피 안됨)
		
	}

}
