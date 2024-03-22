package com.javaex.oop.point;

public class PointApp {
	public static void main(String[] args) {
	
		Point pt = new Point();
		pt.setX(5);
		pt.setY(5);
		pt.draw();
		
		pt.setX(10);
		pt.setY(23);
		pt.draw();

		pt.setX(4.5);
		pt.setY(5);
		pt.draw();
		
	}
}
