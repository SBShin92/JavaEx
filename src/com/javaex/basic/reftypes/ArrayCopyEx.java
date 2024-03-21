package com.javaex.basic.reftypes;

import java.util.Arrays;

public class ArrayCopyEx {

	
	public static void main(String[] args) {
	
		arrayCopyByFor();
		System.out.println("-------------------");
		arrayCopyBySystem();
		System.out.println("-------------------");
	}
	
	
	public static void arrayCopyByFor() {
		int[] intArray = { 1, 2, 3 };
		int[] newArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			newArray[i] = intArray[i];
		}
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(newArray)); // 메소드 활용 출력
	}
	
	
	
	public static void arrayCopyBySystem() {
		int[] intArray = { 1, 2, 3 };
		int[] newArray = new int[10];
		/* System.arraycopy */
		System.arraycopy(intArray, 0, 
				newArray, 0,
				intArray.length);
		/* EnhancedFor문 */
		for (int i: newArray) {
			System.out.print(i + " ");			
		}
		
		System.out.println();
	}
	
}
