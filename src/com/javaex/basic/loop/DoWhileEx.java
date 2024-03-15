package com.javaex.basic.loop;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int value = 0;
		
		do {
			if (total == 0)
				System.out.println("숫자입력[ 0 to quit ] >");
			value = sc.nextInt();
			total += value;
			System.out.println("합계: " + total);
			if (value == 0)
				System.out.println("종료");
		} while(value != 0);
		
		sc.close();
	}
	
}
