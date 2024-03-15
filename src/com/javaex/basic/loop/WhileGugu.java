package com.javaex.basic.loop;

import java.util.Scanner;

public class WhileGugu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dan;
		int i = 1;
		
		// 메세지출력, dan값 입력
		System.out.print("단을 입력해주세요\n단 : ");
		dan = scanner.nextInt();
		
		while (i < 10) {
			//구구단 출력 코드
			System.out.println(dan + " * " + i + " = " + (dan * i));
			++i;
		}
		scanner.close();

	}
	
	
}
