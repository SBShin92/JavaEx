package com.javaex.api.util.date;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        Calendar customCalender = Calendar.getInstance();

        /* month의 경우, idx가 0부터 시작하는 것에 조심! */
        customCalender.set(2012, 1, 24, 8, 45, 0); // February
        System.out.println(now.getTime());
        System.out.println(customCalender.getTime());

        int nowYear = now.get(Calendar.YEAR);
        int nowMonth = now.get(Calendar.MONTH) + 1; // idx 생각
        int nowDate = now.get(Calendar.DATE);

        System.out.printf("%n오늘은 %d년 %d월 %d일 입니다.%n",
                nowYear, nowMonth, nowDate);
        Calendar future = Calendar.getInstance();
        future.add(Calendar.YEAR, 10);
        System.out.printf("10년 후 오늘은 %d년 %d월 %d일 입니다.%n",
                future.get(Calendar.YEAR),
                future.get(Calendar.MONTH) + 1,
                future.get(Calendar.DATE));
    }
}
