package com.javaex.basic.operators;

public class LogicalOperEx {

	public static void main(String[] args) {
		int a = 7;
		int b;
		b = 3;
		// 비교 연산자 : >=, <=, >, <, ==, !=
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
		// -> boolean을 return한다.
	
		// 논리연산자
		// 논리곱(&&)m 논리합(||), 논리부정(!)
		int c = 5;
	
		// c는 0초과, 10미만의 값?
		if (c > 0 && 10 > c)
			System.out.println("true!");
		
		// c는 10 이상?, 10이하? (앞에 부정을 하면 위의 if문과 같아진다)
		if (c >= 10 || c <= 0)
			System.out.println("true!");
		else {
			System.out.println("no..");
		}
	}

}
