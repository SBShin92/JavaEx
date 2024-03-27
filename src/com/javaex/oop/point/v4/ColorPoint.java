package com.javaex.oop.point.v4;

public class ColorPoint extends Point {
    private String color;

    public ColorPoint(double x, double y, String color) {
        super(x, y);
        this.color = color;
        System.out.println("자식클래스 생성자");
    }

    public ColorPoint(String color) {
        super();
        this.color = color;
        System.out.println("자식클래스 생성자");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        if (super.getX() % (int)super.getX() == 0 && super.getY() % (int)super.getY() == 0)
            System.out.printf("%s 색깔의 점[x=%.0f, y=%.0f]을 그렸습니다.\n",
                    color, super.getX(), super.getY());
        else
            System.out.printf("%s 색깔의 점[x=%.2f, y=%.2f]을 그렸습니다.\n",
                    color, super.getX(), super.getY());
    }

    @Override
    public void draw(boolean bDraw) {
        if (bDraw) {
            if (getX() % (int)getX() == 0 && getY() % (int)getY() == 0)
                System.out.printf("%s 색깔 점[x=%.0f, y=%.0f]라구요.\n",
                        color, getX(), getY());
            else
                System.out.printf("%s 색깔 점[x=%.2f, y=%.2f]라구요.\n",
                        color, getX(), getY());
        } else {
            if (getX() % (int)getX() == 0 && getY() % (int)getY() == 0)
                System.out.printf("%s 색깔 점[x=%.0f, y=%.0f]아닌가..?\n",
                        color, getX(), getY());
            else
                System.out.printf("%s 색깔 점[x=%.2f, y=%.2f]아닌가..?\n",
                        color, getX(), getY());
        }
    }
}
