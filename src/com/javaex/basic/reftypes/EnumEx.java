package com.javaex.basic.reftypes;


public class EnumEx {

	public static void main(String[] args) {
	
		Week today = Week.WEDNESDAY;
		
		System.out.println(today);
		
		System.out.printf("오늘은 %s(%d)입니다.\n",
				today.name(), today.ordinal());

		String strWeek = "FRIDAY";
		Week obj = Week.valueOf(strWeek);
		System.out.printf("obj는 %s(%d)입니다.\n", obj.name(), obj.ordinal());
		
	}
}
