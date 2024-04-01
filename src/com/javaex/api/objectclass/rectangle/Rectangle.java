package com.javaex.api.objectclass.rectangle;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /* 인자객체의 필드값과 해당 인스턴스의 필드값 비교 */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            if( width * height ==
                    ((Rectangle)obj).width * ((Rectangle)obj).height) {
                return true;
            } else {
                return false;
            }
        }
        return super.equals(obj);
    }
}
