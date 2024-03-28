package com.javaex.oop.shape.v2;

public class ShapeApp {
    public static void main(String[] args) {
        Circle c = new Circle(4, 5, 5);
        Rectangle r = new Rectangle(0, 0, 5, 4);
        Point p = new Point(-2, -3);

        Drawable objs[] = new Drawable[] {c, r, p};
        for (Drawable obj: objs) {
            if (obj instanceof  Drawable)
                obj.draw();
        }
    }
}
