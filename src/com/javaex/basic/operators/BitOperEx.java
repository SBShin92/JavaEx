package com.javaex.basic.operators;

public class BitOperEx {

	public static void main(String[] args) {
		bitOperTest();
		// bit shift operator
		System.out.println("----------------------");
		bitShiftTest();
		System.out.println("----------------------");
	}

	public static void bitOperTest() {
		byte b1 = 0b1101;
		byte b2 = 0b0111;
	
		int result = b1 & b2;
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 | b2;
		System.out.println(Integer.toBinaryString(result));
		result = b1 ^ b2;
		System.out.println(Integer.toBinaryString(result));
		result = ~b1;
		System.out.println(Integer.toBinaryString(result));
		
		

	}
	public static void bitShiftTest() {
		int val = 1;
		System.out.println(val);
	
		// 1bit move to left
		System.out.println(Integer.toBinaryString(val << 1));
		// 4bit move to left
		System.out.println(Integer.toBinaryString(val << 4));

		System.out.println("----------------------");
		
		int val2 = 0b1000;
		System.out.println(Integer.toBinaryString(val2));
		// 1bit move to right
		System.out.println(Integer.toBinaryString(val2 >> 1));
		// 4bit move to right
		System.out.println(Integer.toBinaryString(val2 >> 4));
	}
	
}
