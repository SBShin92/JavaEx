package com.javaex.basic.reftypes;

public class StringFormatEx {

	public static void main(String[] args) {
		
		String str = "사과";
		int n = 1_000;
		
		System.out.printf("난 %s인데, 갯수는 %,d이야. %n알게찌?%n", str, n);
		
		
		System.out.println("-----------------");
		double pi = Math.PI;
		System.out.printf("파이: %.10f\n", pi);
		
		String fmt = "\"%d개의 %s 중에서 %d개를 먹었다\"";
		System.out.println(fmt.formatted(10, "바나나", 2));
	}
}
