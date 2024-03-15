package com.javaex.basic.types;

public class CastingEx {

	public static void main(String[] args) {

		promotionEx();

		castingEx();

	}
	
	
	public static void promotionEx() {
		System.out.println("암시적 형변환 1 : int + float은?");
		int num1 = 2;
		float num2 = 1.2F;
		float multiply = num1 * num2;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num1 + num2 = " + multiply);
		System.out.println("---------------------");
		System.out.println("암시적 형변환 2 : byte -> short -> int -> long -> float -> double은?");
		byte b = 2;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println("b : " + b);
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		System.out.println("---------------------");
		
		
	}
	
	public static void castingEx() {
		System.out.println("명시적 형변환 1 : int -> byte");
		int intValue = 103029770;
		byte byteValue = (byte)intValue; // 강제 타입 변환
		System.out.println("intValue : " + intValue);
		System.out.println("(byte)intValue : " + byteValue);
		System.out.println("---------------------");
		
		System.out.println("명시적 형변환 2 : char -> short");
		char ch = 'A';
		short sh = (short)ch;
		System.out.println("ch : " + ch);
		System.out.println("sh = (short)ch, 이 때의 sh는? : " + sh);
		System.out.println("---------------------");
		
		System.out.println("명시적 형변환 3 : ");
		double d = 1234567.890;
		System.out.println("d : " + d);
		
		float f = (float)d; // 8bytes -> 4bytes
		System.out.println("f = (float)d, 이 때의 f는? : " + f);
		
		
		long l = (long)f;
		System.out.println("l = (long)f, 이 때의 l는? : " + l);
		
		short s = (short)l;
		System.out.println("s = (short)l, 이 때의 s는? : " + s);
		
	}

}
