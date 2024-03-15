package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice01 {

	public static void main(String[] args) {
		//숫자 입력을 받아 홀짝

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력하세요\n숫자: ");
		double num = scanner.nextDouble();
		
		if (num < 0)
			System.out.println("음수입니다.");
		else if (num == 0)
			System.out.println("0입니다.");
		else if (num % 2 == 0)
			System.out.println("짝수입니다.");
		else if (num % 2 == 1)
			System.out.println("홀수입니다.");
		else
			System.out.println("정수를 적어주세요.");
		
		scanner.close();	
	
	}
}
