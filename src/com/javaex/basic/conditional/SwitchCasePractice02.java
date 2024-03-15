package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchCasePractice02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int num = scanner.nextInt();
		
		switch (num) {
			case 1: // intentional fallthrough
			case 3: // intentional fallthrough
			case 5: // intentional fallthrough
			case 7: // intentional fallthrough
			case 8: // intentional fallthrough
			case 10: // intentional fallthrough
			case 12: {
				System.out.println("\"31일\" 입니다.");
				break ;
			}
			case 4: // intentional fallthrough
			case 6: // intentional fallthrough
			case 9: // intentional fallthrough
			case 11: {
				System.out.println("\"30일\" 입니다.");
				break ;
			}
			case 2: {
				System.out.println("\"28일\" 입니다.");
				break ;
			}
			default: {
				System.out.println("1~12 사이를 입력하세요.");
				break;
			}
		}

		scanner.close();
	}	
}
