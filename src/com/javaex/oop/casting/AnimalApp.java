package com.javaex.oop.casting;

public class AnimalApp {
	public static void main(String[] args) {
		Animal a = new Cat("네로");
		Animal b = new Dog("도지");
		
		Cat c = (Cat)a; // 다운캐스팅
		Dog d = (Dog)b; // 다운캐스팅
		
		Cat e = new Cat("깜디");
		Dog f = new Dog("흰둥이");
		
		System.out.println("-----부모클래스 메소드------");
		a.eat();
		a.walk();
//		a.meow(); // 접근불가
		if (a instanceof Cat) // 다운캐스팅 가능한지?
			((Cat)a).meow();
		else if (a instanceof Dog)
			((Dog)a).bark();
		
		System.out.println("-----------------");
		b.eat();
		b.walk();
//		b.bark(); // 접근불가
		if (b instanceof Cat) // 다운캐스팅 가능한지?
			((Cat)b).meow();
		else if (b instanceof Dog)
			((Dog)b).bark();
		
		
		System.out.println("\n-------다운캐스팅-------");
		c.eat();
		c.walk();
		c.meow();
		
		System.out.println("-----------------");
		d.eat();
		d.walk();
		d.bark();

		System.out.println("\n-----자식클래스 메소드-----");
		e.eat();
		e.walk();
		e.meow();
		
		System.out.println("-----------------");
		f.eat();
		f.walk();
		f.bark();
	}
}
