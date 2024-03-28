package com.javaex.oop.shape.v1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double area = (width * height);
        return area;
    }

    @Override
    public void draw() {
        System.out.printf("사각형[x=%f, y=%f, w=%f, h=%f, area=%f]을 그렸어요.\n",
                x, y, width, height, area());
    }
}
