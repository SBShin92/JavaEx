package com.javaex;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		
		String var1;
		var1 = "문자열";
		String var2 = "문자열";
		String var3 = new String("문자열");

		System.out.println(var1 == var2); // ???
		System.out.println(var2 == var3); // ???
		System.out.println(var1 == var3); // ???

	}

}
