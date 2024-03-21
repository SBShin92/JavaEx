package com.javaex.oop.goods.v2;

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
	
	
}
