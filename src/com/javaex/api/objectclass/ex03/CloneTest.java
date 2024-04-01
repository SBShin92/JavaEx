package com.javaex.api.objectclass.ex03;

public class CloneTest {
    public static void main(String[] args) {
        Point p1 = new Point(4, 5);
        System.out.println("p1 = " + p1);
        System.out.println("---------------");

        /* 참조복사 */
        var p2 = p1;
        p1.setX(400);
        p2.setY(500);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("---------------");

        /* 얕은복사 */
        p2 = p1.getClone();
        p1.setX(400000);
        p2.setY(500000);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("---------------");

        p2.setX(111);
    }
}
