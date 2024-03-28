package com.javaex.oop.shape.v1;

public class Circle extends Shape {

    private double radius;
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public void draw() {
        System.out.printf("원[x=%f, y=%f, r=%f, area=%f]을 그렸어요.\n",
                x, y, radius, area());
    }
}
