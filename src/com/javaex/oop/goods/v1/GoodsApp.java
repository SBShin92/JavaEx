package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 400_000;
		System.out.printf("상품이름 : \"%s\",\t가격 : %d\n", 
				camera.name, camera.price);
		System.out.println("-----------------------------");
		
		

		Goods gd1 = new Goods("LG그램", 900000);
		Goods gd2 = new Goods("머그컵", 2000);
		System.out.printf("상품이름 : \"%s\",\t가격 : %d\n", 
				gd1.name, gd1.price);
		System.out.printf("상품이름 : \"%s\",\t가격 : %d\n", 
				gd2.name, gd2.price);
	}
}
