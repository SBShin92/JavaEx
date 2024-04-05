package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("Size: " + v.size() +
                ", Capacity: " + v.capacity());
        /* 웬만해선 자료 입력 시 addElement로 넣지 말고 객체(add)로 넣자*/
        for (int i = 0; i < 10; i++)
            v.addElement(i); // auto boxing
        System.out.println("Size: " + v.size() +
                ", Capacity: " + v.capacity());
        v.addElement(Integer.valueOf(1)); // Integer 객체로 넣기
        System.out.println("Size: " + v.size() +
                ", Capacity: " + v.capacity());
        System.out.println(v);

        System.out.println("=========  indexOf  ===============");
        Integer val = (Integer) v. elementAt(5);
        System.out.println("val(v.elementAt(5)): " + val);
        System.out.println("indexOf(5): " + v.indexOf(5));
        System.out.println("indexOf(20): " + v.indexOf(20));

        System.out.println("=========  removeElement  ============");
        v.removeElement(7);
        System.out.print("element: ");
        for (Object iter: v) {
            System.out.print(iter + " ");
        }
        System.out.println();

        System.out.println("============  Enumeration?  =============");
        Enumeration e = v.elements();
        while(e.hasMoreElements()) {
            Integer item = (Integer) e.nextElement();
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println(v.elements());

        System.out.println("============  v clear  =============");
        v.clear();
        System.out.println(v);

        System.out.println("===========  v2 Vector  ================");
        Vector<? super Number> v2 = new Vector<>(); // Number 상속받은 클래스만 저장
        v2.addElement(Integer.valueOf(2024)); // OK
        v2.addElement(Float.valueOf(3.141592f)); // OK
//        v2.addElement("Vector"); // String은 Number를 상속받지 않은 객체이므로 불가!

        Enumeration<? super Number> e2 = v2.elements();
        while(e2.hasMoreElements())
            System.out.println(e2.nextElement());
    }
}
