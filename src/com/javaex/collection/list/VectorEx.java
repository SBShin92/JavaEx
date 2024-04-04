package com.javaex.collection.list;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("Size: " + v.size() +
                ", Capacity: " + v.capacity());
        /* 웬만해선 자료 입력 시 addElement로 넣지 말고 객체(add)로 넣자*/
        for (int i = 0; i < 10; i++)
            v.addElement(i); // auto boxing
        System.out.println("Size: " + v.size() +
                ", Capacity: " + v.capacity());
        v.addElement(Integer.valueOf(1)); // Integer 객체로 넣기
        System.out.println("Size: " + v.size() +
                ", Capacity: " + v.capacity());
        System.out.println(v);
        System.out.println("==================================");

        Integer val = (Integer) v. elementAt(5);
        System.out.println("val(v.elementAt(5)): " + val);
        System.out.println("indexOf(5): " + v.indexOf(5));
        System.out.println("indexOf(20): " + v.indexOf(20));
        System.out.println("==================================");

        v.removeElement(7);
        System.out.print("element: ");
        for (Object iter: v) {
            System.out.print(iter + " ");
        }
        System.out.println();
        System.out.println("==================================");

        v.clear();
        System.out.println(v);
        System.out.println("==================================");

    }
}
