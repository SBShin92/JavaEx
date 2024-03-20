package com.javaex.basic.loop;

public class BreakEx {
	public static void main(String[] args) {
		
		under5000();
		System.out.println("-----------");
		multiple6And14();
		
	}
	
	
	public static void under5000() {
		int num = 0;
		int sum = 0;
		
		while (true) {
			sum += num;
			if (sum > 5000) {
				break ;
			}
			System.out.println(sum);
			num++;
		}
	}
	
	
	public static void multiple6And14() {
		int num = 1;
		while (!(num % 6 == 0 && num % 14 == 0))
			++num;
		System.out.println(num);
	}
}

