package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {
    public static void main(String[] args) {
        char[] src = "Java Programming".toCharArray();
        System.out.println(src);
        System.out.println(Arrays.toString(src));
        System.out.println("-----------------------\n");

        /* System.arraycopy */
        char[] target = new char[src.length];
        System.arraycopy(src, 0, target, 0, src.length);
        System.out.println(Arrays.toString(target));
        System.out.println("-----------------------\n");

        /* Array.copyOf */
        target = Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(target));
        System.out.println("-----------------------\n");

        /* Array.copyOfRange */
        target = Arrays.copyOfRange(src, 5, src.length);
        System.out.println(Arrays.toString(target));
        System.out.println("-----------------------\n");
    }
}
