package com.javaex.exception;

public class NullPointerExceptionEx {
    public static void main(String[] args) {
        String str = new String("hello");
        try {
            str = null;
            System.out.println(str.toString());
        } catch (NullPointerException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
