package com.javaex.basic.types;

public class VarEx {

	public static void main(String[] args) {
		// 변수는 영어, 숫자, $, _의 조합으로 만들고
		// 숫자로 시작하면 안되고
		// 통상적으로 소문자로 작성하고, 단어의 조합이면 camelCase로 쓴다.

		int myAge;
		myAge = 52;

		// 다음행은 될 거고
//		myAge = 'g';
		// 다음행은 안 될거임
//		myAge = "g";

		
		System.out.println(myAge);
		System.out.println();
		
		// 한 행에 같이 선언
		int v1 = 10, v2 = 20, v3 = 30;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println();
		
		// 여러 변수에 동일한 값으로 변경 이 때, 각각의 값은?
		v1 = v2 = v3 = 40;
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println();
		
		
		byte a = 120;
		byte b = 120;
		
		byte c = 0;
		
		c = (byte) (a + b);
		System.out.println(c);
		
	}

}
