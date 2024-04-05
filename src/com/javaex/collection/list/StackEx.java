package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < 5; i++)
            s.push(i);

        System.out.println("====original====");
        System.out.println(s);
        System.out.println("empty? : " + s.empty());
        System.out.println("====pop====");
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println("====peek====");
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println("====pop to empty====");
        while(!s.empty())
            System.out.println(s.pop());
        System.out.println(s);
        System.out.println("==============");

        try {
            System.out.println("empty? : " + s.empty());
            System.out.println("pop!");
            s.pop();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
