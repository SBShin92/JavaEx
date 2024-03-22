package com.javaex.oop.methods;

public class MethodEx2 {
	/* 가변인자 */
	public static void main(String[] args) {
		
		System.out.println("Arr sum: " + sumArr(new double[]{1, 2, 3}));
		System.out.println("Variable args sum: " + sum(1, 2, 3));

		/* 
		 * 어차피 인자가 넘어갈 땐 배열로 넘어가기 때문에
		 * sumArr를 쓰나 sum을 쓰나 똑같다.
		 */
		printSum("Arr?", new double[] {1, 2, 3});
		printSum("args?", 1, 2, 3);
	}
	
	/* 배열합 */
	public static double sumArr(double[] numArr) {

		double val = 0;
		for (double num:numArr) {
			val += num;
		}
		return val;
	}
	
	/* 가변인자 합 */
	public static double sum(double ... nums) {
	
		double val = 0;
		for(double num:nums) {
			val += num;
		}
		return val;
	}
	
	/* 고정인자, 가변인자 같이 받아보자 */
	public static void printSum(String message,
			double ... values) {
		System.out.println(message + sum(values));
	}
}
