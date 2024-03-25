package com.javaex.oop.point.v1;

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
