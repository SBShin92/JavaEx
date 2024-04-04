package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {

        /* List는 객체가 아니라 인터페이스이다 */
        List<String> lst = new LinkedList<>();

        lst.add("Java");
        lst.add("C");
        lst.add("C++");
        lst.add("Python");
        System.out.println("lst: " + lst);
        lst.add(2, "C#");
        System.out.println("lst: " + lst);
        lst.add("Java");
        System.out.println("lst: " + lst);
        System.out.println("size: " + lst.size());
//        System.out.println("capacity: " + lst.capacity()); // NG, 리스트는 크기랄 게 없지

        lst.remove(2);
        lst.remove("Python");
        System.out.println(lst);
        lst.remove("Java");
        System.out.println(lst);
        lst.remove("Java");
        System.out.println(lst);

        lst.clear();
        System.out.println(lst);
    }
}
