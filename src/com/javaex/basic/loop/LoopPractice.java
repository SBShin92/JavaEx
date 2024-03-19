package com.javaex.basic.loop;

public class LoopPractice {

	public static void main(String[] args) {
		
		System.out.println("----------whileGugu");
		whileGugu();
		System.out.println("-----------forGugu");
		forGugu();
		System.out.println("-----------whileStar");
		whileStar();
		System.out.println("-----------forStar");
		forStar();
	}
		
	
	
	public static void whileGugu() {
		int i = 2;
		while (i < 10) {
			int j = 1;
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + (i * j));
				++j;
			}
			++i;
		}
	}
	
	public static void forGugu() {
		for (int i = 2; i < 10; i++)
			for (int j = 1; j < 10; j++)
				System.out.println(i + "*" + j + "=" + (i * j));
	}
	
	
	public static void whileStar() {
		
		int i = 1;
		while (i <= 6) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				++j;
			}
			System.out.println("");
			++i;
		}
	}
	
	public static void forStar() {
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
