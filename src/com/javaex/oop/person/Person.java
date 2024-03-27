package com.javaex.oop.person;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("\n**부모 생성자 호출**\n");
    }
    public Person(String name, int age) {
        System.out.println("\n**부모 생성자 호출**\n");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo() {
        System.out.printf("이름: %s, 나이: %d\n", name, age);
    }
}
