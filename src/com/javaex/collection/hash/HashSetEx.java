package com.javaex.collection.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student other)
            return (id == other.id) && (name.equals(other.name));
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();

        usingHashSet();

        System.out.println("===================\n");
        setOperation();

        System.out.println("===================\n");
        usingHashSetWithCustom();
    }

    /* 직접 hashCode값을 정해 중복사항을 피하게 하자 */
    private static void usingHashSetWithCustom() {
        HashSet<Student> myHashSet = new HashSet<>();

        myHashSet.add(new Student(10, "임요환"));
        myHashSet.add(new Student(20, "임요환"));
        myHashSet.add(new Student(4, "홍진호"));
        /* id와 name이 같아서 추가되지 않을 것이다. */
        myHashSet.add(new Student(4, "홍진호"));

        System.out.println(myHashSet);
        Iterator iter = myHashSet.iterator();
        while (iter.hasNext())
            System.out.println(iter.next().hashCode());
    }

    private static void usingHashSet() {
        HashSet<String> myHashSet = new HashSet<>();

        myHashSet.add("Java");
        myHashSet.add("C");
        myHashSet.add("C++");
        myHashSet.add("Python");
        /* also same... */
        myHashSet.add(new String("Java"));

        System.out.println("======== myHashSet ==========");
        System.out.println(myHashSet);
        System.out.println("size : " + myHashSet.size());
        System.out.println("cpp is there? : " + myHashSet.contains("C++"));

        System.out.println("======== remove C++ ==========");
        myHashSet.remove("C++");
        System.out.println(myHashSet);
    }

    /* setOperation들은 메서드 사용 시 인스턴스 자체가 변하기 때문에 조심! */
    private static void setOperation() {
        HashSet<Integer> numbers =
                new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); // return ArrrayList
        HashSet<Integer> odds =
                new HashSet<>(Arrays.asList(1, 3, 5 , 7, 9));
        HashSet<Integer> mThree =
                new HashSet<>(Arrays.asList(3, 6, 9));

        System.out.println("numbers : " + numbers);
        System.out.println("odds : " + odds);
        System.out.println("mThree : " + mThree);

        System.out.println("=========== retainAll ========");
        HashSet<Integer> setA = (HashSet<Integer>)odds.clone();
        HashSet<Integer> setB = (HashSet<Integer>)mThree.clone();
        System.out.println("odds retain mThree? : " + setA.retainAll(setB)); // 값이 변한다. 조심!
        System.out.println("result : " + setA);

        System.out.println("=========== addAll ========");
        setA = (HashSet<Integer>)odds.clone();
        setB = (HashSet<Integer>)mThree.clone();
        System.out.println("odds add mThree? : " + setA.addAll(setB)); // 값이 변한다. 조심!
        System.out.println("result : " + setA);

        System.out.println("=========== removeAll ========");
        setA = (HashSet<Integer>)odds.clone();
        setB = (HashSet<Integer>)mThree.clone();
        System.out.println("odds remove mThree? : " + setA.removeAll(setB)); // 값이 변한다. 조심!
        System.out.println("result : " + setA);

        System.out.println("=========== containsAll ========");
        setA = (HashSet<Integer>)odds.clone();
        setB = (HashSet<Integer>)mThree.clone();
        System.out.println("odds contains mThree? : " + setA.containsAll(setB)); // 변할 값이 없다.(부분집합)
        setA = (HashSet<Integer>)numbers.clone();
        System.out.println("numbers contains odds? : " + setA.containsAll(setB)); // 변할 값이 없다.(부분집합)
    }


}
