package com.javaex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		// System.out.println, System.out.print, System.out.printf
		
		System.out.print("Hello");
		System.out.println("Java");

		String str1 = "Hello";
		String str2 = "Java";
		
		System.out.println(str1 + " " + str2);

		System.out.println("----------------------");
		
		// escape sequence( \n, \t, \', \\, etc...)
		System.out.println("hello\n'World\'");
		System.out.println("this\tis\ttab");
		System.out.println("\"DoYouWriteMe?\"");
		
		String path = "C:\\Users\\Hong\\memo.txt";
		System.out.println(path);
		System.out.println("----------------------");
		
	}

}
