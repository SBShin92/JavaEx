package com.javaex.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
	
		String[] names;
		int scores[];
		
		names = new String[] {
				"김",
				"이",
				"박",
				"정"
		};
		String str = "김";
		System.out.println(names[0] == str); // true!
		System.out.println("-------------------");
		
		double height[] = {
				175.5,
				170.2,
				180.3,
				165.2
		};
		System.out.println("--------------------");

		scores = new int[4];
		System.out.println("--------------------");
		
		scores[0] = 70;
		scores[1] = 72;
		scores[2] = 75;
		scores[3] = 62;
//		scores[4] = 99; // 갯수 지키쇼
		
		for (int i = 0; i < names.length; i++) {
			System.out.printf("이름: %s, 키: %.2f, 점수: %d\n",
					names[i], height[i], scores[i]);
		}
	}
}
