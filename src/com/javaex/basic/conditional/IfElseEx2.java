package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx2 {

	public static void main(String[] args) {
		//숫자 입력을 받아 음수, 양수, 0 분기

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력하세요 : ");
		double num = scanner.nextDouble();
		
		if (num > 0)
			System.out.println("양수네요");
		else if (num == 0)
			System.out.println("0이네요");
		else
			System.out.println("음수네요");
		
		
		scanner.close();
		
	}
	
}
