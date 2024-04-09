package com.javaex.functional.stream;

import java.util.Arrays;

public class StreamReduceEx {
    public static void main(String[] args) {
        int[] scores = {80, 90, 70, 100, 60, 50};
        testReduce(scores);
    }

    private static void testReduce(int[] arr) {
        System.out.println("==== reduce =====");
        System.out.println(Arrays.toString(arr));

        int total = Arrays.stream(arr)
                .reduce(0,
                        (acc, curr) -> {
                            System.out.println("acc : " + acc);
                            System.out.println("curr : " + curr);
                            return (acc + curr);
                        });
        System.out.println("Total? : " + total);
    }
}
