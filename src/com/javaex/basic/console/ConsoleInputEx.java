package com.javaex.basic.console;

import java.util.Scanner;

public class ConsoleInputEx {

	public static void main(String[] args) {
		// 스캐너 열기
		// 데이터 입력
		// 스캐너 닫기
		Scanner scanner = new Scanner(System.in);
		
		int age;
		System.out.print("나이 > ");
		age = scanner.nextInt();
		
		String name;
		System.out.print("이름 > ");
		name = scanner.next();
		
		System.out.println("안녕하세요 " + name + " 님.\n당신의 나이는 " + age + " 입니다.");
		
		
		scanner.close(); // Important!!
	}

}
