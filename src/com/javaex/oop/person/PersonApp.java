package com.javaex.oop.person;

public class PersonApp {

    public static void main(String[] args) {
        Person p = new Person("정우성", 45);
        System.out.println("---------------------\n");
        Student s1 = new Student("서울고등학교");
        System.out.println("---------------------\n");
        Student s2 = new Student("이정재", 45, "한국고등학교" );
        System.out.println("---------------------\n");
        System.out.println("---------------------\n");

        p.showInfo();
        s1.showInfo();
        s2.showInfo();

    }
}
