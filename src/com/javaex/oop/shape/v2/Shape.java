package com.javaex.oop.shape.v2;

public abstract class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();
//    public abstract void draw();
}
