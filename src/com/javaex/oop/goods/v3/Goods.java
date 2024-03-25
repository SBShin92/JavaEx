package com.javaex.oop.goods.v3;

public class Goods {

	private String name;
	private int price;
	
	Goods() {};
	Goods(String name, int price) {
		this.name = name;
		this.price = price;
	};
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.printf("상품이름 : \"%s\",\t가격 : %,d\n",
				name, price);
	}
}
