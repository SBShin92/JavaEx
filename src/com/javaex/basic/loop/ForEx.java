package com.javaex.basic.loop;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dan;
		
		// 메세지출력, dan값 입력
		System.out.print("단을 입력해주세요\n단 : ");
		dan = scanner.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));			
		}
		scanner.close();
	}
}
