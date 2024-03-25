package com.javaex.oop.point.v3;

public class Point {
	private double x;
	private double y;
	
	public Point() {
		// TODO Auto-generated constructor stub
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
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
	public void draw(boolean bDraw) {
		if (bDraw) {
			if (x % (int)x == 0 && y % (int)y == 0)
				System.out.printf("점[x=%.0f, y=%.0f]라구요.\n",
						x, y);
			else
				System.out.printf("점[x=%.2f, y=%.2f]라구요.\n",
						x, y);
		} else {
			if (x % (int)x == 0 && y % (int)y == 0)
				System.out.printf("점[x=%.0f, y=%.0f]아닌가..?\n",
						x, y);
			else
				System.out.printf("점[x=%.2f, y=%.2f]아닌가..?\n",
						x, y);
		}
	}
}
