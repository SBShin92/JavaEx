package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods("nikon", 400_000);
		System.out.printf("상품이름 : \"%s\",\t가격 : %,d\n", 
				camera.getName(), camera.getPrice());
		System.out.println("-----------------------------");

		
		Goods gd1 = new Goods("LG그램", 900000);
		Goods gd2 = new Goods("머그컵", 2000);
		System.out.printf("상품이름 : \"%s\",\t가격 : %,d\n", 
				gd1.getName(), gd1.getPrice());
		System.out.printf("상품이름 : \"%s\",\t가격 : %,d\n", 
				gd2.getName(), gd2.getPrice());
	}
}
