package com.javaex.basic.reftypes;

public class ArrayMultiDimEx {
	public static void main(String[] args) {
		int[][] twoDim = new int[5][10]; // 선언 방법		
		System.out.println(twoDim[0][0]);
		
		int[][] table = {
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{2, 3, 4, 5, 6, 7, 8, 9, 10, 1},
				{3, 4, 5, 6, 7, 8, 9, 10, 1, 2},
				{4, 5, 6, 7, 8, 9, 10, 1, 2, 3},
				{5, 6, 7, 8, 9, 10, 1, 2, 3, 4}
		};
		System.out.println(table.length);
		System.out.println(table[0].length);
		int sum = 0;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + ", ");
				sum += table[i][j];
			}
			System.out.println("");
		}
		System.out.println("합: " + sum);
	}
}
