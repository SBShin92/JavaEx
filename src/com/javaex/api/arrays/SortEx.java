package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;

class Member implements Comparable {
    String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Member) {
            Member other = (Member)o;
            return name.compareTo(other.name);
        }
        return 0;
    }
}

public class SortEx {
    public static void main(String[] args) {
        basicSort();
        System.out.println("-----------------\n");
        basicDescSort();
        System.out.println("-----------------\n");
        customClassSort();
    }

    private static void basicSort() {
        int[] scores = {80, 50, 30, 90, 75, 88, 77};
        System.out.println("배열 원본: " + Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println("배열 정렬(오름차순): " + Arrays.toString(scores));
    }
    private static void basicDescSort() {
        Integer[] scores = {80, 50, 30, 90, 75, 88, 77};
        System.out.println("배열 원본: " + Arrays.toString(scores));
        Arrays.sort(scores, Collections.reverseOrder());
        System.out.println("배열 정렬(내림차순): " + Arrays.toString(scores));
    }

    private static void customClassSort() {
        Member[] members = {
                new Member("홍길동"),
                new Member("임꺽정"),
                new Member("장길산"),
                new Member("임꺽정")
        };
        System.out.println("원본 배열: " + Arrays.toString(members));
        Arrays.sort(members);
        System.out.println("정렬(오름차순): " + Arrays.toString(members));
        Arrays.sort(members, Collections.reverseOrder());
        System.out.println("정렬(내림차순): " + Arrays.toString(members));
    }
}
