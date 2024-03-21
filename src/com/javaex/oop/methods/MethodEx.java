package com.javaex.oop.methods;

public class MethodEx {

	public static void main(String[] args) {

		printMessage();
		System.out.println("------------");
		System.out.println(getMessage());
		System.out.println("------------");
		printDevide(4, 0);
		System.out.println("------------");
		double sum = getSum(4, 5);
		System.out.println("sum value is: " + sum);
		System.out.println("------------");
	}
	
	private static void printMessage() {
		System.out.println("No have parameter, return value.");
	}
	
	public static String getMessage() {
		return "I'll give you a message return.";
	}
	
	public static void printDevide(double num1, double num2) {
		System.out.println("devide value is " + (num1 / num2));
	}
	
	public static double getSum(double num1, double num2) {
		
		return (num1 + num2);
	}
}
