package com.javaex.basic.conditional;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(범위 0-100) : ");
		int num = scanner.nextInt();
		
		if (num >= 90 && num <= 100)
			System.out.println("A등급");
		else if (num >= 80 && num < 90)
			System.out.println("B등급");
		else if (num >= 70 && num < 80)
			System.out.println("C등급");
		else if (num >= 60 && num < 70)
			System.out.println("D등급");
		else if (num >= 0 && num < 60)
			System.out.println("F등급");
		else
			System.out.println("범위 내의 점수를 입력하세요.");
		
		scanner.close();
	}
}
