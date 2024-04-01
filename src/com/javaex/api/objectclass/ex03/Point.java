package com.javaex.api.objectclass.ex03;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            if( x == ((Point)obj).x && y == ((Point)obj).y) {
                return true;
            } else {
                return false;
            }
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    public Point getClone() {
        Point clone = null;
        try {
            clone = (Point)clone();
        } catch (CloneNotSupportedException e) {}
        return clone;
    }
}