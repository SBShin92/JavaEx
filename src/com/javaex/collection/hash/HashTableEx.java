package com.javaex.collection.hash;

import java.util.*;

class Classroom {
    private String subject;
    private String roomName;

    public Classroom(String subject) {
        this.subject = subject;
    }

    public Classroom(String subject, String roomName) {
        this.subject = subject;
        this.roomName = roomName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classroom classroom)) return false;
        return subject.equals(classroom.subject);
    }

    @Override
    public int hashCode() {
        return subject.hashCode();
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "subject='" + subject + '\'' +
                ", roomName='" + roomName + '\'' +
                '}';
    }
}

public class HashTableEx {
    public static void main(String[] args) {

        Map<String, Classroom> map = new Hashtable<>();

        map.put("101", new Classroom("Java", "R101"));
        map.put("202", new Classroom("C", "R202"));
        map.put("303", new Classroom("Python", "R303"));
        map.put("404", new Classroom("Linux", "R404"));


        System.out.println(map);
        System.out.println(map.get("303")); // key를 통한 접근
        map.put("202", new Classroom("C#", "R202"));
        System.out.println(map.get("202"));

        /* compare, find */
        System.out.println("is there 202 key? : " + map.containsKey("202"));
        System.out.println("is there 'Java' value? : " +
                map.containsValue(new Classroom("Java")));

        System.out.println(" ========== map의 key iterator =============== ");
        Iterator<String> iter = map.keySet().iterator();
        while (iter.hasNext())
            System.out.println(map.get(iter.next()));
    }
}


