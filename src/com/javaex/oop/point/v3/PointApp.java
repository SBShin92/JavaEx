package com.javaex.oop.point.v3;

public class PointApp {
	public static void main(String[] args) {
	
		Point pt = new Point();
		pt.setX(5);
		pt.setY(5);
		pt.draw();
		
		pt.setX(10);
		pt.setY(23);
		pt.draw(true);

		Point pt2 = new Point(4.5, 5);
		pt2.draw(false);
		
	}
}
