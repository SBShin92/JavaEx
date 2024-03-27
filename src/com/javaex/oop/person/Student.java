package com.javaex.oop.person;

public class Student extends Person {
    private String schoolName;

    public Student(String name, int age, String schoolName) {
        super(name, age);
        System.out.println("\n**자식 생성자 호출**\n");
        this.schoolName = schoolName;
    }

    public Student(String schoolName) {
        super();
        System.out.println("\n**자식 생성자 호출**\n");
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("\t\t학교: %s\n", schoolName);
    }
}
