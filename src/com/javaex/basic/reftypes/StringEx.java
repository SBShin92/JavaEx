package com.javaex.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		String var1;
		var1 = "문자열";
		String var2 = "문자열";
		String var3 = new String("문자열");

		System.out.println(var1 == var2); // true
		System.out.println(var2 == var3); // false
		System.out.println(var1 == var3); // false
		
		System.out.println("-----------");
		System.out.println(var1.equals(var2)); // true
	}
}
