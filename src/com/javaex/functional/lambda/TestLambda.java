package com.javaex.functional.lambda;

import java.util.function.BiFunction;

public class TestLambda {
    public static void main(String[] args) {

        System.out.println("--- testCallLambda ---");
        testCallLambda();

        System.out.println();
        System.out.println("--- testLambdaParams ---");
        testLambdaParams(10, 20, (x, y) -> x + y);

        System.out.println();
        System.out.println("--- HighOrderFunction ---");
        MyFunction hof = testHOF();
        System.out.println("hof 값 : " +
                hof.getResult(100, 300));
    }

    private static void testCallLambda() {

        MyFunction funcAnony = new MyFunction() {
            @Override
            public int getResult(int x, int y) {
                return x + y;
            }
        };
        MyFunction funcLambda = (x, y) -> x + y;
        System.out.println("합 : " +
                funcAnony.getResult(5, 6));
        System.out.println("합 : " +
                funcLambda.getResult(10, 5));

        System.out.println("======== BiFunction ==========");
        BiFunction<Integer,
                Integer,
                Integer> funcBi = (x, y) -> {return (x * y);};

        System.out.println("BiFunction 2 * 3 : " +
                funcBi.apply(2, 3));
    }

    private static void testLambdaParams(int x, int y, MyFunction f) {
        System.out.println("값? : " +
                f.getResult(x, y));
    }

    /* Higher Order Function */
    private static MyFunction testHOF() {
        return (x, y) -> x + y;
    }
}
