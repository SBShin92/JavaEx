package com.javaex.basic.types;

public class CharEx {

	public static void main(String[] args) {

		// char : 문자 1 개의 유니코드를 저장
		// 내부적으로는 숫자 코드지만 출력시에는 상응하는 문자 1개를 출력해준다.
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch1를 int로? : " + (int)ch1);
		System.out.println("ch2를 int로? : " + (int)ch2);
		System.out.println("ch1 + ch2 : " + (ch1 + ch2));
		System.out.println("-------------------");
		
		System.out.println("아래는 문자열, char형이랑 구분하도록");
		String str = "A한";
		System.out.println(str);
		System.out.println("-------------------");
		
		
		
	}

}
