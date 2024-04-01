package com.javaex.api.objectclass.ex02;

public class LangClassTest {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        Point p2 = new Point(2, 3);

        System.out.println(p == p2);
        System.out.println(p.equals(p2));
    }
}
