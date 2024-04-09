package com.javaex.functional.stream;

public class Student {
    private String name;

    private int kor;
    private int eng;
    private int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", getTotal()=" + getTotal() +
                ", getAverage()=" + getAverage() +
                '}';
    }
}