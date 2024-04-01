package com.javaex.api.objectclass.ex01;

public class LangClassTest {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        System.out.println(p.getClass().getName());
        System.out.println(p.hashCode());
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println("--------------------");

        /* Point 클래스의 부모는? */
        System.out.println(p.getClass().getSuperclass().getName());
        System.out.println("--------------------");

        /* 각 객체는 해시값이 다르다! */
        Point p2 = new Point(2,3);
        System.out.println(p2.hashCode());
        System.out.println("--------------------");

        System.out.println(p == p2);
        System.out.println(p.equals(p2));
    }
}
