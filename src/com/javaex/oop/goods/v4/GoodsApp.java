package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods("nikon", 400_000);
		System.out.printf("상품이름 : \"%s\",\t가격 : %,d\n", 
				camera.getName(), camera.getPrice());
		System.out.println("-----------------------------");

//		Goods gd1 = new Goods();
//		gd1.setName("LG티비");
//		gd1.setPrice(900_000);
//		gd1.showInfo();
//		System.out.println("------차이가 느껴지십니까---------");
//		
//		Goods gd2 = new Goods("머그컵", 2000);
//		System.out.printf("상품이름 : \"%s\",\t가격 : %,d\n", 
//				gd2.getName(), gd2.getPrice());
	}
}
