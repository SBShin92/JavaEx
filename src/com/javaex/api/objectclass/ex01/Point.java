package com.javaex.api.objectclass.ex01;

/*
* Object 클래스는 객체의 기본적인 기능들이 구현되어 있다
*/

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    /* 인자객체의 필드값과 해당 인스턴스의 필드값 비교 */
    public boolean equals(Point p) {
        if( x == p.x && y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}
