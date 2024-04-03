package com.javaex.api.util.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date myDate = new Date();
        System.out.println(myDate.toString());

        DateFormat myDateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(myDateFormat.format(myDate));
        System.out.println(DateFormat.getDateInstance(DateFormat.LONG).format(myDate));
        System.out.println(DateFormat.getDateInstance(DateFormat.MEDIUM).format(myDate));
        System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(myDate));

        SimpleDateFormat mySimpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss");
        System.out.println(mySimpleDateFormat.format(myDate));
        mySimpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
        System.out.println(mySimpleDateFormat.format(myDate));
    }
}
