package com.javaex.oop.shape.v2;

public class Point implements Drawable{

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.printf("점[x=%f, y=%f]을 찍었어요.\n",
                x, y);
    }
}
