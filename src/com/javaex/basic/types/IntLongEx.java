package com.javaex.basic.types;

public class IntLongEx {

	public static void main(String[] args) {

		// int 형 (4byte)
		int intVar1;
//		int intVar2;
		
		
		intVar1 = 2024;
//		intVar2 = 1234567890123; // overflow
		
		System.out.println(intVar1);
//		System.out.println(intVar2); // 초기화 필요
		System.out.println();
		
		
		//	long 형 (8byte)
		long longVar1;
		long longVar2;
		
		longVar1 = 2024;
		longVar2 = 1234567890123L; // long자료형을 쓸 때에는 맨 뒤에 L을 꼼꼼히 붙여주자. 없을 땐 int범위가 넘어가면 에러가 나기 때문.
		
		System.out.println(longVar1);
		System.out.println(longVar2);	
		System.out.println();
		
		long amount = 1_000_000_000_000L; // 요런식으로도 된다네
		System.out.println(amount);
		System.out.println();
		
		// 진법 표기 : Bin, Oct, Hex
		
		int bin, oct, hex;
		
		bin = 0b1100;	// 2진수 표기법 : 숫자 앞에 0b;
		oct = 072;		// 8진수 표기법 : 숫자 앞에 0;
		hex = 0xFF;		// 16진수 표기법 : 숫자 앞에 0x;
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println();
		
	}

}
