package com.javaex.basic.operators;

public class ArithOperEx {

	public static void main(String[] args) {

//		arithOperTest(); // 부호, 사칙연산
		incrOperTest(); // 증감연산
		
		assignOperTest();
		
	}
	
	public static void arithOperTest() {
	
		int a = 7;
		int b = 3;
		
		// 부호연산
		System.out.println(-a);
		System.out.println("--------------------");
		
		// 사칙연산
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println("--------------------");
		
		// 정수의 나눗셈은 정수
		System.out.println((double)a / b); // 한 개만 붙여도 자동으로 형변환이 되지만... 가시성을 위해 명시적으로 해주도록 하자
	}
	

	public static void incrOperTest() {
		int a = 10;
		int b;
		
		System.out.println(a);
		b = ++a;
		System.out.println(b);
		System.out.println(a);
		System.out.println("--------------------");
		
		
		a = 10;
		System.out.println(a);
		b = a++;
		System.out.println(b);
		System.out.println(a);
		System.out.println("--------------------");
	}
	
	
	public static void assignOperTest() {
		
		int a = 7;
		int b = 3;
		
		a = a + b;
		System.out.println(a);
		a += b;
		System.out.println(b);
		System.out.println("--------------------");
	}
	
}
