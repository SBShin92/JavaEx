package com.javaex.oop.point.v1;

public class Point {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void draw() {
		if (x % (int)x == 0 && y % (int)y == 0)
			System.out.printf("점[x=%.0f, y=%.0f]을 그렸습니다.\n",
					x, y);
		else
			System.out.printf("점[x=%.2f, y=%.2f]을 그렸습니다.\n",
					x, y);
	}
}
