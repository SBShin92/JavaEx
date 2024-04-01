package com.javaex.api.objectclass.ex02;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /* 인자객체의 필드값과 해당 인스턴스의 필드값 비교 */
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
}
