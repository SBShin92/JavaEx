package com.javaex.api.stringclass;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This"); //생성
        System.out.println(sb);
        sb.append(" is pencil"); // 문자열 덧붙이기
        System.out.println(sb);
        sb.insert(7, " my"); // 문자열 삽입
        System.out.println(sb);
        sb.replace(7, 10, " your"); // 문자열 대치
        System.out.println(sb);
        sb.setLength(6); // 버퍼크기 조정
        System.out.println(sb);
        System.out.println("-----------------\n");

        /* method chaining */
        StringBuffer sb2 = new StringBuffer("this")
                .append(" is pencil")
                .insert(7, " my");
        System.out.println(sb2);
    }
}
