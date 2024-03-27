package com.javaex.oop.point.v4;

public class PointApp {
	public static void main(String[] args) {
	
		Point pt = new Point(4, 4);
		pt.draw();
		System.out.println("----------------------\n");

		ColorPoint cp1 = new ColorPoint("red");
		cp1.draw();
		System.out.println("----------------------\n");

		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.draw(true);
		System.out.println("----------------------\n");

		Point cp3 = new ColorPoint(5, 5, "dark");
		cp3.draw(false);

	}
}
