package com.javaex.functional.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) {
        int[] scores = {80, 90, 70, 100, 60, 50};

        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 90, 95, 100));
        students.add(new Student("고길동", 80, 50, 90));
        students.add(new Student("전우치", 80, 90, 80));
        students.add(new Student("임꺽정", 70, 65, 70));
        students.add(new Student("장길산", 60, 60, 60));

        /* for each 구현방법 3가지 */
        testForEach(scores);
        System.out.println("\n- - - - - - - - - - - - - - \n");

        /* filter 예제 */
        testFilter(scores, students);
        System.out.println("\n- - - - - - - - - - - - - - \n");

        /* map 예제 */
        testMap(scores);
        System.out.println("\n- - - - - - - - - - - - - - \n");

        /* count, sum 예제 */
        testCountSum(scores);
        System.out.println("\n- - - - - - - - - - - - - - \n");

        /* sort 예제 */
        testFilterSort(students);
    }

    private static void testForEach(int[] arr) {
        System.out.println("======== stream forEach =========");

        // 방법 1 for문
        System.out.println("// 방법 1");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 방법 2 forEach(iterator 활용)문
        System.out.println("\n// 방법 2");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 방법 3 stream forEach
        System.out.println("\n// 방법 3");
        Arrays.stream(arr)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    private static void testFilter(int[] arr, List<Student> lst) {
        System.out.println("==== Stream filter =====");
        System.out.println(Arrays.toString(arr));

        /* 일반 배열의 경우 */
        Arrays.stream(arr)
                .filter(n -> n >= 70)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        /* 리스트(자료구조)의 경우 */
        lst.stream()
                .filter(obj -> obj.getAverage() >= 70)
                .forEach(System.out::println);
    }

    private static void testMap(int[] arr) {
        System.out.println("==== Stream map =====");
        System.out.println(Arrays.toString(arr));

        Arrays.stream(arr)
                .map(n -> n / 2)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        int[] multiply = Arrays.stream(arr)
                .map(n -> n * 2)
                .toArray();

        System.out.println("mul 2? : " + Arrays.toString(multiply));

    }

    private static void testCountSum(int[] arr) {
        System.out.println("========= count, sum =========");
        System.out.println(Arrays.toString(arr));

        int sum = Arrays.stream(arr)
                .sum();
        System.out.println("sum : " + sum);
        int count = (int)Arrays.stream(arr)
                .count();
        System.out.println("count : " + count);
    }

    private static void testFilterSort(List<Student> lst) {
        System.out.println("========= sort =========");

        /* 내림차순 정리 */
        lst.stream()
                .filter(obj -> obj.getAverage() >= 70)
                .sorted((obj1, obj2) -> obj2.getName().compareTo(obj1.getName()))
                .forEach(System.out::println);

        /* 다음과 같이 쓸 수도 있다 */
        System.out.println("---------------------");
        lst.stream()
                .filter(obj -> obj.getAverage() >= 70)
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
    }
}
