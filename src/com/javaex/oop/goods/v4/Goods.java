package com.javaex.oop.goods.v4;

public class Goods {

	private String name;
	private int price;
	
	Goods(String name) {
		this.name = name;
		System.out.println("name 필드 초기화 생성자");
	}
	
	Goods() {};
	Goods(String name, int price) {
		this(name);
		this.price = price;
		System.out.println("전체 필드 초기화 생성자");
	}
	
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
