package com.javaex.oop.methods;

public class MethodPractice {
	// 1
	public static void printHelloMethod() {
		System.out.println("Hello Method!");
	}
	// 2
	public static void printNumbers() {
		for (int i = 1; i <= 10; i++)
			System.out.print(i);
		System.out.println();
	}
	// 3
	public static int getRandomNumber() {
		return ((int)(Math.random() * 101));
	}
	// 4
	public static int getSum() {
		int val = 0;
		for (int i = 1; i <= 10; i++) {
			val += i;
		}
		return val;
	}
	// 5
	public static void printOddOrEven(int num) {
		if (num % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}
	// 6
	public static void printStringLength(String str) {
		System.out.println(str.length());
	}
	// 7
	public static int getLargeNumber(int n1, int n2) {
		if (n1 >= n2)
			return n1;
		else
			return n2;
	}
	// 8
	public static String concatenateStrings(String s1, String s2) {
		return (s1 + s2);
	}
	// 9
	public static int sumAll(int ... nums) {
		int val = 0;
		for (int num:nums)
			val += num;	
		return val;
	}
	// 10
	public static String concatenateStrings(String ... strs) {
		String resultStr = "";
		for (String str:strs)
			resultStr += str;
		return resultStr;
	}
}
