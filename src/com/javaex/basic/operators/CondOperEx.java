package com.javaex.basic.operators;

public class CondOperEx {

	public static void main(String[] args) {
		int a = 10;
		
		// a가 짝수면 true, 홀수면 false 출력
		String result = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println(a + " is " + result);
		System.out.println("-----------------");
		
		int score = 70;
		String message;
		
		// score 80 or more : good
		// score 50 or more to under 80 : pass
		// score under 50 : fail
		
		message = score >= 80 ? "Good!" :
					score >= 50 ? "Pass.": "Fail....";
			
		System.out.println(message);
		
		
	}

}
