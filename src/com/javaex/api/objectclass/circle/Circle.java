package com.javaex.api.objectclass.circle;

public class Circle {
    private int x;
    private int y;
    private int r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    /* 인자객체의 필드값과 해당 인스턴스의 필드값 비교 */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            if(r == ((Circle)obj).r) {
                return true;
            } else {
                return false;
            }
        }
        return super.equals(obj);
    }
}
