package com.javaex.oop.shape.v1;

public class ShapeApp {
    public static void main(String[] args) {
        Shape s1 = new Circle(4, 5, 5);
        Shape s2 = new Rectangle(0, 0, 5, 4);

        s1.draw();
        s2.draw();
    }
}
