package com.javaex.api.generic;

public class BoxApp {
    public static void main(String[] args) {
        Integer intTmp;
        String strTmp;

        StringBox strBox = new StringBox();
        strBox.setContent("I'm String");
        System.out.println(strBox.toString());
        System.out.println("-------------------");

        IntegerBox intBox = new IntegerBox();
        intBox.setContent(42);
        System.out.println(intBox);
        System.out.println("-------------------");

        /* Object Class */
        ObjectBox objBox = new ObjectBox();
        objBox.setContent("wow, I'm String but I'm in objectBox");
        System.out.println(objBox.toString());
        objBox.setContent(42);
        System.out.println(objBox.toString());
        /* 잘못된 객체로 참조할 가능성이 있음 */
//        strTmp = (String)objBox.getContent(); // NG! 현재 content의 객체는 Integer
        intTmp = (Integer)objBox.getContent(); // OK.
        System.out.println("-------------------");

        /* Generic */
        GenericBox<String> genBox = new GenericBox<>();
        genBox.setContent("and also, I'm String but I'm in genericBox");
        System.out.println(genBox.toString());
//        genBox.setContent(42); // NG!
//        System.out.println(genBox.toString());
    }
}
