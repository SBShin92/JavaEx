package com.javaex.basic.loop;

public class RandomEx {
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 6; i++) {
			System.out.print(((int)(Math.random() * 45) + 1) + "\t");
		}
		System.out.println("");
	}
}
