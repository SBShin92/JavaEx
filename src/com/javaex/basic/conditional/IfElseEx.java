package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {

		// 점수 입력, 60점 이상이면 합격입니다 출력
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수는?");
		int score = scanner.nextInt();
		
		if (score >= 60 && score <= 100)
			System.out.println("합격입니다~");
		else if (score > 100 || score < 0)
			System.out.println("잘못 입력하셨습니다.");
		else
			System.out.println("불합격.");
		
		scanner.close();
	}
	
}
