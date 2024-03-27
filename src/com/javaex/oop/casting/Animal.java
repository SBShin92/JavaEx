package com.javaex.oop.casting;

public class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + " 이(가) 먹고 있다.");
	}
	
	public void walk() {
		System.out.println(name + " 이(가) 산책중...");
	}
}
