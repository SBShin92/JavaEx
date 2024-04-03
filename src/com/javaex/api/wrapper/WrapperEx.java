package com.javaex.api.wrapper;

public class WrapperEx {
    public static void main(String[] args) {

//        Integer i = new Integer(10); // Deprecated
//        Character c = new Character('c'); // Deprecated
        Float f = Float.valueOf(3.14159f);
        Boolean b = Boolean.valueOf(true);

        /* input string -> each value! */
        Integer i2 = Integer.valueOf("2024");
        Double d2 = Double.valueOf("3.14159");
        Boolean b2 = Boolean.valueOf("false");

        /* boxing, unboxing */
        Integer i3 = 10; // Integer 객체에 바로 int형 대입
        int result = i3 + 2; // Integer와 int의 연산값을 int에 대입

        System.out.println(Integer.parseInt("-123"));
        System.out.println(Integer.parseInt("10", 16));
        System.out.println(Integer.toBinaryString(28));
        System.out.println("--------------------");

        System.out.println(i2.doubleValue());
        System.out.println("--------------------");

        /* compare of 'Objects!' */
        Integer i4 = Integer.valueOf(2024);
        Integer i5 = Integer.valueOf(2024);
        System.out.println(i4 == i5);
        System.out.println(i4.intValue() == i5.intValue());
        System.out.println(i4.equals(i5));
    }
}
