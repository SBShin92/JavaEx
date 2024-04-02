package com.javaex.api.arrays;

import java.util.Arrays;

public class SearchEx {
    public static void main(String[] args) {
        basicSearch();
        System.out.println("----------------\n");

        customClassSearch();
    }

    private static void basicSearch() {
        int[] nums = {6, 4, 3, 5, 7, 9, 8, 2, 1, 10};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.binarySearch(nums, 5));

        String[] datas = {"Java", "C", "C++", "Python", "Linux"};
        Arrays.sort(datas);
        System.out.println(Arrays.toString(datas));
    }

    private static void customClassSearch() {
        Member m1 = new Member("홍길동");
        Member m2 = new Member("임꺽정");
        Member m3 = new Member("장길산");
        Member m4 = new Member("임꺽정");
        Member[] members = {m1, m2, m3, m4};

        System.out.println("원본 배열: " + Arrays.toString(members));
        Arrays.sort(members);
        System.out.println("정렬(오름차순): " + Arrays.toString(members));
        int idx = Arrays.binarySearch(members, m3);
        System.out.println(m3 + " idx : " + idx);
    }
}
